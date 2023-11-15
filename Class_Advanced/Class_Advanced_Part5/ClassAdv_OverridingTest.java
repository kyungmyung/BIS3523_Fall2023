package Class_Advanced_Part5;

public class ClassAdv_OverridingTest {
	
	
	protected int a;
	protected int b;
	
	public void setA(int a) {
	System.out.println("Parent Method");
	this.a = a;
	}
	
	public void setB(int b) {
	this.b = b;
	}
	
	public int getA() {
	return a;
	}
	
	public int getB() {
	return b;
	}

	
}
