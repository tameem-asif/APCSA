package DriversEdabstract;

public class Unknown extends Driver {
	public Unknown(String name, int driverAge, int issueYear)
	{
		super(name, driverAge, issueYear);
	}
	public void ValidateLicense()
	{
		if(driverAge>=19&&passedexam)
		{
			validLicense = true;
			expirationYear = issueYear+1;
			stateOfLicense = "Unknown";
		}
		else validLicense = false;
	}
}
