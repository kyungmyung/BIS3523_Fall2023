package Class_Basic_Part2;

public class Rentcar_Employee {
	private String name;
	private String department;
	private int age;
	private String position;
	
	public void setEmployee(String _name, String _department, int _age, String _position) {
		name = _name;
		department = _department;
		age = _age;
		position = _position;
		
	}
		
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPosition() {
		return position;
	}
	

}
