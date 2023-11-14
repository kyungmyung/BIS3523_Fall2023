package Syntax_Part3;

public class Syntax12_ArrayBasic {
	public static void main(String[] args) {
		
		// Single Array

		int [] a;

		a = new int[10];
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
		
			
			a[i] = i+1;
			sum += a[i];
			
			System.out.println("Sum = " + sum);
		}
		
		// MD array
		double h=1;
		
		System.out.println(" H = " + h);
	
		int[][] array1 = new int[5][5];
		
		// first for statement will assign row values
		// second for statement will assign column values
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				// i =1; k==0;
				//array1[0][0] = (0*0) + 0;
				
				//array1[1][0] == 0;
				
				array1[i][k] = (i*k) +k;
				System.out.println("Array row " + i + ", Array column " + k + ", Array value = " + array1[i][k]);
			}
			
		}
		
		
	}

}
