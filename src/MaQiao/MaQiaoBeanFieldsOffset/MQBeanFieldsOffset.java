package MaQiao.MaQiaoBeanFieldsOffset;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import MaQiao.Constants.Constants;
import sun.misc.Unsafe;
import static MaQiao.Constants.Constants.FieldTypeEnum;
import static MaQiao.MaQiaoBeanFieldsOffset.Consts.booleanType;
/**
 * Class对象的各属性 类型 偏移地址记录
 * @version 1.1
 * @since 1.7
 * @author Sunjian
 *
 */
public final class MQBeanFieldsOffset {
	private static final Unsafe UNSAFE = Constants.UNSAFE;
	@SuppressWarnings("unused")
	private transient volatile int locked = booleanType.False.index;
	transient volatile ArrayList<Bean> beanList = new ArrayList<Bean>();

	public MQBeanFieldsOffset() {
	}

	public MQBeanFieldsOffset(final Object obj) {
		get(obj.getClass());
	}

	public Bean get(final Object obj) {
		return get(obj.getClass());
	}

	public Bean get(final Class<?> classzz) {
		lock();
		try {
			int find;
			if ((find = indexOf(classzz)) == -1) {
				add(classzz);
				if ((find = indexOf(classzz)) != -1) return beanList.get(find);
			} else {
				return beanList.get(find);
			}
			return null;
		} finally {
			unLock();
		}
	}

	/**
	 * 得到对象是否已经分析，如分析得到下标，没有则返回-1<br/>
	 * @param classzz Class< ? >
	 * @return int
	 */
	private int indexOf(final Class<?> classzz) {
		//if (beanList.get(i).classzz.equals(classzz)) return i;
		for (int i = 0, identityHashCode = System.identityHashCode(classzz), len = beanList.size(); i < len; i++)
			if (beanList.get(i).identityHashCode == identityHashCode) return i;
		return -1;
	}

	private void add(final Class<?> classzz) {
		for (int i = 0, identityHashCode = System.identityHashCode(classzz); i < beanList.size(); i++)
			if (beanList.get(i).classzz.equals(classzz) && beanList.get(i).identityHashCode != identityHashCode) beanList.remove(i--);
		final Bean e = new Bean(classzz);
		beanList.add(e);
		final Field[] fields = classzz.getDeclaredFields();
		int len = fields.length;
		if (len == 0) return;
		int lenStates;
		/*计算多少个静态变量*/
		for (int i = lenStates = 0; i < len; i++)
			if ((fields[i].getModifiers() & java.lang.reflect.Modifier.STATIC) == java.lang.reflect.Modifier.STATIC) lenStates++;
		int lenf = len - lenStates;
		if (lenf > 0) e.fieldsOffsets = new FieldsOffset[lenf];
		if (lenStates > 0) e.fieldsStaticOffsets = new FieldsOffset[lenStates];
		for (int i = 0, fi = 0, si = 0; i < len; i++) {
			final Field field = fields[i];
			FieldsOffset f = new FieldsOffset();
			//if(field.getName().equals("enumA"))
				//System.out.println("--->enumA\t:"+field.isEnumConstant());
			//System.out.println(field.getName()+"=\t:"+field.getType().getName()+"\tisEnumConstant()"+field.isEnumConstant());
			f.fieldName = field.getName();
			if (field.getType().isArray()) {/*判断是是数组*/
				f.isArray = true;
				final String typeName = field.getType().getName();
				f.fTE = FieldTypeEnum.getByASMType2(typeName.substring(1, typeName.length()));
				if (f.fTE == null) if (typeName.length() > 2) insert(typeName.substring(2, typeName.length() - 1));
			} else {
				f.fTE = FieldTypeEnum.getByReflectFields(field.getType().getName());
				if (f.fTE == null) insert(field.getType());
			}/*判断是否是static属性以决定UNSAFE的调用方法得到偏移量*/
			if ((field.getModifiers() & java.lang.reflect.Modifier.TRANSIENT) == java.lang.reflect.Modifier.TRANSIENT) f.isTransient = true;
			if ((field.getModifiers() & java.lang.reflect.Modifier.STATIC) == java.lang.reflect.Modifier.STATIC) {
				f.staticFieldObject = UNSAFE.staticFieldBase(field);
				f.offSet = UNSAFE.staticFieldOffset(field);
				e.fieldsStaticOffsets[si++] = f;
			} else {
				f.offSet = UNSAFE.objectFieldOffset(field);
				e.fieldsOffsets[fi++] = f;
			}
			//f.offSet = (f.isStatic = ((field.getModifiers() & java.lang.reflect.Modifier.STATIC) == java.lang.reflect.Modifier.STATIC)) ? UNSAFE
			//.staticFieldOffset(field) : UNSAFE.objectFieldOffset(field);
		}
		//System.out.println("------------------------------------------------");
		/*排序 按偏移量进行排序*/
		if (lenf > 1) e.fieldsOffsets = FieldsSort(e.fieldsOffsets);
		if (lenStates > 1) e.fieldsStaticOffsets = FieldsSort(e.fieldsStaticOffsets);
	}

	/**
	 * 在检索Fields时，发现外部对象，则添加这个对象信息
	 * @param classzz Class
	 */
	private void insert(final Class<?> classzz) {
		//if (beanList.get(i).classzz.equals(classzz)) return;
		for (int i = 0, identityHashCode = System.identityHashCode(classzz), len = beanList.size(); i < len; i++)
			if (beanList.get(i).identityHashCode == identityHashCode) return;
		add(classzz);
	}

	/**
	 * 在检索Fields时，发现外部对象数组，则添加这个对象信息
	 * @param classString String
	 */
	private void insert(String classString) {
		if (classString == null) return;
		if (classString.indexOf('/') > 0) classString = classString.replace('/', '.');
		for (int i = 0, len = beanList.size(); i < len; i++)
			if (beanList.get(i).className.equals(classString)) return;
		try {
			add(Class.forName(classString));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MQBeanFieldsOffset [beanList=" + beanList + "]";
	}

	public final class Bean {
		transient int identityHashCode = 0;
		transient Class<?> classzz = null;
		transient String className = null;
		transient FieldsOffset[] fieldsOffsets = new FieldsOffset[0];
		transient FieldsOffset[] fieldsStaticOffsets = new FieldsOffset[0];

		public final int getIdentityHashCode() {
			return identityHashCode;
		}

		public final Class<?> getClasszz() {
			return classzz;
		}

		public final String getClassName() {
			return className;
		}


		public final FieldsOffset[] getFieldsOffsets() {
			//System.out.println("aaa");
			return fieldsOffsets;
		}

		public FieldsOffset[] getFieldsStaticOffsets() {
			return fieldsStaticOffsets;
		}

		public Bean() {

		}

		public Bean(final Class<?> classzz) {
			this.identityHashCode = System.identityHashCode(classzz);
			this.classzz = classzz;
			this.className = classzz.getName();
		}

		@Override
		public String toString() {
			System.out.println("----------------------------属性------------------------------");
			System.out.println("偏移量\t是否数组\t属性类型\t\t属性名称");
			for (int i = 0; i < fieldsOffsets.length; i++) {
				System.out.println(fieldsOffsets[i].offSet + "\t" + fieldsOffsets[i].isArray + "\t\t" + fieldsOffsets[i].fTE + "\t\t\t" + fieldsOffsets[i].fieldName);
				//if(fieldsOffsets[i].isStatic)System.out.println("----------------------------------------------------------");
			}
			System.out.println("----------------------------静态属性------------------------------");
			System.out.println("偏移量\t是否数组\t属性类型\t\t属性名称");
			for (int i = 0; i < fieldsStaticOffsets.length; i++) {
				System.out.println(fieldsStaticOffsets[i].offSet + "\t" + fieldsStaticOffsets[i].isArray + "\t\t" + fieldsStaticOffsets[i].fTE + "\t\t\t" + fieldsStaticOffsets[i].fieldName);
				//if(fieldsOffsets[i].isStatic)System.out.println("----------------------------------------------------------");
			}
			System.out.println("----------------------------属性结束------------------------------");
			return "Bean [identityHashCode=" + identityHashCode + ", classzz=" + classzz + ", className=" + className + ", fieldsOffsets=" + Arrays.toString(fieldsOffsets) + ", fieldsStaticOffsets="
					+ Arrays.toString(fieldsStaticOffsets) + "]";
		}
	}

	public final class FieldsOffset {
		transient String fieldName = null;
		transient Object staticFieldObject=null;
		transient boolean isArray = false;
		transient boolean isTransient = false;
		transient FieldTypeEnum fTE = null;
		transient long offSet = 0L;

		public final String getFieldName() {
			return fieldName;
		}

		public final Object getStaticFieldObject() {
			return staticFieldObject;
		}

		public final boolean isArray() {
			return isArray;
		}

		public final boolean isTransient() {
			return isTransient;
		}

		public final FieldTypeEnum getfTE() {
			return fTE;
		}

		public final long getOffSet() {
			return offSet;
		}

		@Override
		public String toString() {
			return "FieldsOffset [fieldName=" + fieldName + ", isArray=" + isArray + ", isTransient=" + isTransient + ", fTE=" + fTE + ", offSet=" + offSet + "]";
		}

	}

	/**
	 * 锁定对象
	 */
	private final void lock() {
		lockedOffsetCAS(booleanType.False, booleanType.True);
	}

	/**
	 * 释放对象锁
	 */
	private final void unLock() {
		lockedOffsetCAS(booleanType.True, booleanType.False);
	}

	/**
	 * volatile int locked 主锁的CAS，循环设置锁<br/>
	 * @param from booleanType
	 * @param to booleanType
	 */
	private final void lockedOffsetCAS(final booleanType from, final booleanType to) {
		while (!UNSAFE.compareAndSwapInt(this, Consts.lockedOffset, from.index, to.index)) {
		}
	}

	private final static FieldsOffset[] FieldsSort(final FieldsOffset[] fieldsOffsets) {
		int len;
		if ((len = fieldsOffsets.length) <= 1) return fieldsOffsets;
		FieldsOffset it;
		for (int i = 0, ii; i < len - 1; i++)
			for (ii = i + 1; ii < len; ii++)
				if (fieldsOffsets[i].offSet > fieldsOffsets[ii].offSet) {
					it = fieldsOffsets[ii];
					fieldsOffsets[ii] = fieldsOffsets[i];
					fieldsOffsets[i] = it;
				}
		return fieldsOffsets;
	}
}