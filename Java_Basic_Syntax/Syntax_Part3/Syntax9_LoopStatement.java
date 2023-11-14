package Syntax_Part3;

public class Syntax9_LoopStatement {

	public static void main(String[] args) {
		// For example 1
		for(int k=1; k<10; k++) {
	    	   System.out.println(k);
	    	   if(k==3) {
	    		   break;
	    	   }
			}
			
		
		// For example 2
		for(int i=1; i<10; i++) {
		       // i ==1
			   //if(i==3) {
			      //continue;
			   //}
			for(int k=1; k<10; k++) {
	    	   System.out.println(i + " * " + k + " = " + i*k);
			}
				
			if(i==3) {
				continue;
			}
			}
		
		// Do While 
		int a=0;
		int sum=0;
		
		do {
			sum = sum + a;
			a++;
			
		} while(a<10);
		
		System.out.print("Sum = " + sum);
	
		
}
}
