package Syntax_Part4;

public class Syntax14_Sorting {

	public static void main(String[] args) {
		int[] num = {5,3,4,1,2};
		int temp = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int k=i; k<num.length; k++) {
				
				// What if 
				//if(num[i]>num[k]) 
				// ascending order or descending order???
				if(num[i]<num[k]) 
				{
				 temp = num[i];
				 num[i] = num[k];
				 num[k] = temp;
					
				}
				
			}
		}

		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		}

	}


