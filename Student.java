
public class Student extends People {
	
	private String major;
	private double gpa;
	
	public Student(String fName, String lName, String pNum, String m) 
	{
		super(fName, lName, pNum);
		this.gpa = 0;
	}
	
	public void setGpa(double g) 
	{
		gpa = g;
	}
	
	public void changeMajor(String m) 
	{
		major = m;
	}
	
	public String toString() 
	{
		String result = "Major: " + major + " " + "GPA: " + gpa;
		return result;
	}
	
}
