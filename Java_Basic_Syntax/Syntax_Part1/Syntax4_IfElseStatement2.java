package Syntax_Part1;

import javax.swing.JOptionPane;

public class Syntax4_IfElseStatement2 {
	public static void main(String[] args) {
		
		String in = JOptionPane.showInputDialog("Scores from studnets");
		
		if(Integer.parseInt(in)<=100 && Integer.parseInt(in)>=0) 
		{
		int score = Integer.parseInt(in);
		String grade;		
		int category = score/10;
		if(category>=9) {
			grade = "A";
		} else if (category>=8) {
			grade = "B";
		} else if (category>=7) {
			grade = "C";
		} else if (category>=6) {
			grade = "D";
		} else {
			grade = "F";
		}
		JOptionPane.showMessageDialog(null, "Grade : " + grade);
		} 
		else {
			System.out.println("Error");
		}
		
	}
}
