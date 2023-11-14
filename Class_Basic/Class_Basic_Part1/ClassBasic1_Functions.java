package Class_Basic_Part1;


public class ClassBasic1_Functions {
	
	// No return
	private void fun1() {
		System.out.println("This is fun 1");
	}
	
	// Return Data: Type --> String
	private String fun2() {
		return "Fun 2";
	}
	
	// Return Data: Type --> Integer
	private int fun3() {
		return 100;
	}
	
	// Return Data: Type --> Integer 
	// function with parameters
	private int fun4(int parmeter1, int parameter2) {
		return parmeter1 + parameter2;
	}

	
	public static void main(String[] args) {
		
		// object1 is the object to capture all functions within ClassBasic1_Functions class
		ClassBasic1_Functions object1 = new ClassBasic1_Functions();

		object1.fun1();
		System.out.println("Function2 activated : " + object1.fun2());
		System.out.println("Function3 activated : " + object1.fun3());
		System.out.println("Function4 activated : " + object1.fun4(100,200));
	
		
	}

}
