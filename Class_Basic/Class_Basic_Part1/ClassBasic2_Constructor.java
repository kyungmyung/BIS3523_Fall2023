package Class_Basic_Part1;

public class ClassBasic2_Constructor {
	
	private String name;
	
	// _name is a parameter to the construct of the class "ClassBasic2_Constrctor"
	// Why underscore ????
	// It distinguishes other variables in the class.
	// _name comes from outside not inside!!!
	
	public ClassBasic2_Constructor(String _name)
	
	{
	name = _name;
	}
	
	public ClassBasic2_Constructor()
	{
	}
	
	// Get name
	public String getName() {
		return name;
	}
	// Set name
	public void setName(String _name) {
		name = _name;
	}

}
