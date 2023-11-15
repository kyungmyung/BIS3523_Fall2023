package Class_Advanced_Part5;

public class ClassAdv_OverridingInherit extends ClassAdv_OverridingTest { // Inherit ClassAdv_OverridingTest
   
	protected int c;
	
	public void setA(int a, int b, int c) {
		System.out.println("Overriding Method");
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println("A : " + this.a);
		System.out.println("B : " + this.b);
		System.out.println("C : " + this.c);
		
		}
	
	


}
