package Syntax_Part4;

import java.util.Scanner;

public class Syntax15_ArrayCompare {

	public static void main(String[] args) {
		Scanner keyboard_input = new Scanner(System.in);
		
		
		int array_value = 5;
		int condition_value = 10;
		
		int[] A1 = new int[array_value];
		
		for(int i=0; i<array_value; i++) {
			A1[i] = keyboard_input.nextInt();
			System.out.println("A1[i] = "+ A1[i]);
		}
		//Compare value between the condition_value and A1[i] 
		
		for(int i=0; i<array_value; i++) {
			if(A1[i]<condition_value) {
				System.out.print(A1[i] + " ");
			}
		}
		

	}

	}


