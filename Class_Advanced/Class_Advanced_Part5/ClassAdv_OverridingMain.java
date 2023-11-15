package Class_Advanced_Part5;

public class ClassAdv_OverridingMain {

	public static void main(String[] args) {
		
		ClassAdv_OverridingTest overtest = new ClassAdv_OverridingTest();
		overtest.setA(30);
		System.out.println(overtest.getA());
		
		
		ClassAdv_OverridingInherit overinherittest = new ClassAdv_OverridingInherit();
		overinherittest.setA(10, 20,30);
		
	}

}
