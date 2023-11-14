package Syntax_Part2;

public class Syntax9_TrueFalse {

	public static void main(String[] args) {
		
		int a=0;
		int b=10;
		int c=0;
		
		// False && False
		System.out.println((a!=0) && ((c=b) > 20)); //False
		System.out.println("c= " + c); // c = 0;
		
		// False & False
		System.out.println( (a!=0) & ((c=b) > 20)); //False
		System.out.println("c= " + c);
		
		c=0;
		// True & False
		System.out.println( (a==0) || ((c=b) > 20));
		System.out.println("c= " + c);
		// True & False
		System.out.println( (a==0) | ((c=b) > 20));
		System.out.println("c= " + c);
	}

}
