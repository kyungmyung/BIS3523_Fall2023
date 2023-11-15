package Class_Advanced_Part1;

public class ClassAdv_Main {

	public static void main(String[] args) {
		
		String studentInfo = null;
		
		// Get HighSchoolStudent class into h (i.e., object)
		// Send two parameters ("A" and 13) to ClassAdv_HighScoolStudent
		// Call the Parent Class & the High School Constructor
		ClassAdv_HighScoolStudent h = new ClassAdv_HighScoolStudent("A", 13);
		
		// Send three parameters ("B", 3, and "Business") to ClassAdv_HighScoolStudent
		// Call the Parent Class & University Constructor
		ClassAdv_UniversityClass  u = new ClassAdv_UniversityClass ("B", 3, "Business");
		
		// Call High School
		// Get Student --> Call getStudent in the Parent class
		// Student info =  Name: A , Year : 13
		studentInfo = h.getStudent();
		System.out.println("Student info = " + studentInfo);
		
		// Get Student --> Call getStudent in the Parent class
		//Student info =  Name: B , Year : 3, Major : Business
		
		studentInfo = u.getStudent();
		System.out.println("Student info = " + studentInfo + ", Major : " + u.getMajor());
		
		/*Tips: Children cannot exist without parents. Thus, the parent class will be
		generated first */

	}

}
