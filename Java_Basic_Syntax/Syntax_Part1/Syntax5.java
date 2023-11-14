package Syntax_Part1;

public class Syntax5 {
	public static void main(String[] args) {
		
		// Byte Type
		
		byte b1 = 12;
		byte b2 = 17;
		//byte b3 = b1 + b2; --> Error
		byte b3 = (byte)(b1+b2);
		System.out.println("b3 : " + b3);
		
		// Short Type
		
		short s1 = 12;
		short s2 = 17;
		//byte b3 = b1 + b2; --> Error
		short s3 = (short)(s1+s2);
		System.out.println("s3 : " + s3);
		
		// Integer Type
		
		int num1 = 4;
		int num2 = 5;
		int num3 = num1 + num2;
		System.out.println("num3 : " + num3);
		
		// Double Type
		double h = 3.14F;
		float f = (float)3.14;
		float f2 = 3.14F + 3.14F;
		System.out.println("f2 : "+f2);
		
		
	}

}
