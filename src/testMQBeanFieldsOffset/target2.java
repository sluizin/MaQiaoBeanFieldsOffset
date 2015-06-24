package testMQBeanFieldsOffset;

import java.io.Serializable;

public class target2  implements Serializable{
	  private static final long serialVersionUID = -5182532647273106745L;
	  private String c2cc="defff";
	  private int a2aa=15;
	  private Integer b2bb=new Integer(5);
	  public target2(){
		  
	  }
	  public target2(int a,String c){
		  a2aa=a;
		  c2cc=c;
	  }
	  
	  
	
	public int getA2aa() {
		return a2aa;
	}
	public void setA2aa(int a2aa) {
		this.a2aa = a2aa;
	}
	public Integer getB2bb() {
		return b2bb;
	}
	public void setB2bb(Integer b2bb) {
		this.b2bb = b2bb;
	}
	public String getC2cc() {
		return c2cc;
	}
	public void setC2cc(String c2cc) {
		this.c2cc = c2cc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
