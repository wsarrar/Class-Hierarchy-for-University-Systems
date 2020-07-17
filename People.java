
public class People {
	protected String first_name;
	protected String last_name;
	protected String phoneNumber;
	protected double payRate;
	protected double monthlyPay;
	
	public People(String first_name, String last_name, String phoneNumber) 
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneNumber = phoneNumber;
		payRate = 0.0;
		monthlyPay = 0.0;
	}
	
	public void calculatePay() 
	{
		monthlyPay = 0.0;
	}
	
	public String getName() 
	{
		return first_name + " " + last_name;
	}
	
	public String toString() 
	{
		String result = "Name: " + first_name + " " + last_name
		+ "Phone number: " + phoneNumber;
		return result;
	}
}
