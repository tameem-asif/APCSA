package DriversEdabstract;

public class Driver {
	String name;
	String stateOfLicense;
	int driverAge;
	int issueYear;
	int expirationYear;
	boolean validLicense;
	boolean passedexam;
	
	public Driver(String name, int driverAge, int issueYear)
	{
		this.name=name;
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
		System.out.println("Passed Exam: " + validLicense);
	}
	
	public void Exam()
	{
		int rando = (int)(Math.random()*10+1);
		if(rando>6) passedexam = false;
		else passedexam = true;
	}
}
