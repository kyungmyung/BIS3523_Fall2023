package Class_Basic_Part1;

public class ClassBasic3_Constructor_Main {

	public static void main(String[] args) {
		// Generate Instance (i.e., object in JAVA) --> name as obj1 
		
		// obj1 can be 
		
		ClassBasic2_Constructor obj1 = new ClassBasic2_Constructor();
		
		obj1.setName("Your name here");
		System.out.println(obj1.getName());
		
		// obj2 can be
		
		ClassBasic2_Constructor obj2 = new ClassBasic2_Constructor("Type Your Name");
		System.out.println(obj2.getName());
		

	}

}
