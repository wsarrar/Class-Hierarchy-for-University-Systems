
public class Staff extends Employee 
{
	
	private String title;
	
	public Staff(String fName, String lName, String pNum, 
	double pR, int pS, String t) 
	{
		super(fName, lName, pNum, pR, pS);
		this.title = t;
	}
	
	public void calculatePay() 
	{
		monthlyPay = payRate / payScale;
	}
	
	public String toString() 
	{
		String result = "Title: " + title 
		+ "Monthly pay: " + monthlyPay;
		return result;
	}
}
