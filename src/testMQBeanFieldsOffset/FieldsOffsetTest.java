package testMQBeanFieldsOffset;
import org.junit.Test;

import MaQiao.MaQiaoBeanFieldsOffset.MQBeanFieldsOffset;

@SuppressWarnings("unused")
public class FieldsOffsetTest {
	static MQBeanFieldsOffset mq=new MQBeanFieldsOffset();
	@Test
	public void test() {
		long starttime,endtime;
		Corp corp=new Corp();

		starttime=System.nanoTime();
		MQBeanFieldsOffset.Bean a=mq.get(Corp.class);
		endtime=System.nanoTime();
		System.out.println("1Time\t:"+(endtime-starttime));
		
		
		starttime=System.nanoTime();
		MQBeanFieldsOffset.Bean b=mq.get(corp.getClass());
		endtime=System.nanoTime();
		System.out.println("2Time\t:"+(endtime-starttime));
		

		
		
		starttime=System.nanoTime();
		MQBeanFieldsOffset.Bean c=mq.get(Corp.class);
		endtime=System.nanoTime();
		System.out.println("3Time\t:"+(endtime-starttime));
		
		
		starttime=System.nanoTime();
		MQBeanFieldsOffset.Bean d=mq.get(corp.getClass());
		endtime=System.nanoTime();
		System.out.println("4Time\t:"+(endtime-starttime));
		
		System.out.println(mq.toString());
		
	}

}
