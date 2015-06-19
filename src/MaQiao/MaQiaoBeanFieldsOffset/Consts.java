package MaQiao.MaQiaoBeanFieldsOffset;

import MaQiao.Constants.Constants;

/**
 * 常量池 <br/>
 * @author Sun.jian(孙.健) <br/>
 */
public final class Consts {
	/**
	 * 初始化
	 */
	public Consts() {
	}
	/**
	 * 本对象的锁对象 locked 的地址偏移量
	 */
	static long lockedOffset = 0L;
	static {
		try {
			lockedOffset = Constants.UNSAFE.objectFieldOffset(MQBeanFieldsOffset.class.getDeclaredField("locked"));/*得到锁对象的偏移量*/
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
	/**
	 * boolean的状态:<br/>
	 * False(0):假<br/>
	 * True(1):真<br/>
	 * @author Sunjian
	 */
	static enum booleanType {
		/**
		 * 假(0)
		 */
		False(0),
		/**
		 * 真(1)
		 */
		True(1);
		/**
		 * False:假(0)<br/>
		 * True:真(1)<br/>
		 */
		int index;

		/**
		 * 构造初始化
		 * @param index int
		 */
		private booleanType(final int index) {
			this.index = index;
		}
		/**
		 * 得到枚举中的int index值
		 * @return int
		 */
		public final int getIndex(){
			return index;
		}
		public static final booleanType getBooleanType(final int index) {
			for (booleanType c : booleanType.values())
				if (c.index == index) return c;
			return null;
		}
	}	

}
