import java.util.ArrayList;
public class Faculty extends Employee 
{
	
	private String department;
	private String [] classesTeach;
	
	public Faculty(String fName, String lName, String pNum, 
	double pR, int pS, String d) 
	{ 
		super(fName, lName, pNum, pR, pS);
		this.department = d;
	}
	
	public void addClass(String cT) 
	{
		for(int i = 0; i < classesTeach.length; i++) 
		{
			classesTeach[i] = cT;
			i++;
		}
	}
	
	public void calculatePay() 
	{
		monthlyPay = ((payRate / payScale)
		+ 500 * classesTeach.length);
	}
	
	public String toString() 
	{
		String result = "Classes: " + classesTeach + " " 
		+ "Monthly pay: " + monthlyPay;
		return result;
	}
	
}
