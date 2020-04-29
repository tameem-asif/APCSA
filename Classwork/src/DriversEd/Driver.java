package DriversEd;

public class Driver {
	String name;
	String stateOfLicense;
	int driverAge;
	int issueYear;
	int expirationYear;
	boolean validLicense;
	
	public Driver(String name, int driverAge, int issueYear)
	{
		this.name = name;
		this.driverAge = driverAge;
		this.issueYear = issueYear;
	}
	
	public void print()
	{
		System.out.println("Name: " + name);
		System.out.println("State: " + stateOfLicense);
		System.out.println("Age: " + driverAge);
		System.out.println("Year Issued: " + issueYear);
		System.out.println("Year Expire: " + expirationYear);
		System.out.println("Valid License: " + validLicense);
	}
	
	public void ValidateLicense()
	{
		if(driverAge>=19)
		{
			validLicense = true;
			expirationYear = issueYear+1;
			stateOfLicense = "Unknown";
		}
		else validLicense = false;
	}
}

