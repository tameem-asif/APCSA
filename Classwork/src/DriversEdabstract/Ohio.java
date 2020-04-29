package DriversEdabstract;

public class Ohio extends Driver {
	public Ohio(String name, int driverAge, int issueYear)
	{
		super(name, driverAge, issueYear);
	}
	public void validateLicense()
	{
		if(driverAge>=18&&passedexam)
		{
			expirationYear = issueYear+2;
			validLicense = true;
			stateOfLicense = "Ohio";
		}
		else validLicense = false;
	}
}
