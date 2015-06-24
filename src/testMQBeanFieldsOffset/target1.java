package testMQBeanFieldsOffset;

public class target1 {
	private int a=100;
	private String t="aa1";
	private float n=100;
	public final int getA() {
		return a;
	}
	public final void setA(int a) {
		this.a = a;
	}
	public final String getT() {
		return t;
	}
	public final void setT(String t) {
		this.t = t;
	}
	public final float getN() {
		return n;
	}
	public final void setN(float n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "target1 [a=" + a + ", t=" + t + ", n=" + n + "]";
	}
	
}
