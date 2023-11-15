package Class_Advanced_Part1;

public class ClassAdv_UniversityClass extends ClassAdv_Student {
	
	private String major;
	
	public ClassAdv_UniversityClass(String _name, int _year, String _major) {
		System.out.println("Call University Constructor");
		name = _name;
		year = _year;
		major = _major;
	}
	
	public String getMajor(){
		return major;
	}

}
