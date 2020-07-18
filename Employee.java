
public class Employee extends People 
{
	protected int payScale;
	
	public Employee(String fName, String lName, String pNum, double pR, int pS) 
	{
		// Calls constructor from the parent class (People class)
		super(fName, lName, pNum);
		this.payScale = pS;
	}
}
