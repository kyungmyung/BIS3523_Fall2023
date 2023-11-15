package Class_Advanced_Part1;

public class ClassAdv_Student {
	/*
	These values need to be shared with only child
	classes. Thus, we create variables as “protected”. If
	some classes are not child classes, you cannot call the
	values through the classes.
	*/
	
	protected String name;
	protected int year;
	
	
	public ClassAdv_Student() { //--> We define this as Constructor 
		System.out.println("Call the Parent Class");
		}
	
	public String getStudent() {
		System.out.println("Call getStudent in the Parent class");
		return " Name: " + name + " , Year : " + year;
		}




}


