package Class_Advanced_Part3;

public class ClassAdv_SuperTest {
	protected int a;
	protected int b;
	
	
	public ClassAdv_SuperTest() {
		System.out.println("Call the Parent Class");
		}
	
	public ClassAdv_SuperTest(int _a) {
		a = _a;
		System.out.println("A is " + a);
		}
	
	public ClassAdv_SuperTest(int _a, int _b) {
		a = _a;
		b = _b;
		System.out.println("A is " + a);
		System.out.println("B is " + b);
		}
	
	
}
