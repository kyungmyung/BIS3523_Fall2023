package Class_Basic_Part2;

public class Rentcar_Main {

	public static void main(String[] args) {
		
		Rentcar_Employee e = new Rentcar_Employee();
		//Set Value
		e.setEmployee("A", "Sales", 30, "CEO");
		//Get Value
		System.out.println("Name = " + e.getName());

		Rentcar_Employee e1 = new Rentcar_Employee();
		
		// Set Value 
		e1.setEmployee("B", "Sales", 32, "Manager");
		// Get Value
		System.out.println("Name = " + e1.getName());

	}

}
