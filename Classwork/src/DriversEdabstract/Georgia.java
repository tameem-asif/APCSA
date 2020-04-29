package DriversEdabstract;

public class Georgia extends Driver {
	public Georgia(String name, int driverAge, int issueYear)
	{
		super(name, driverAge, issueYear);
	}
	public void validateLicense()
	{
		if(driverAge>=16&&passedexam)
		{
			expirationYear = issueYear+3;
			validLicense = true;
			stateOfLicense = "Georgia";
		}
		else validLicense = false;
	}
	public void Exam()
	{
		int rando = (int)(Math.random()*10+1);
		if(rando>8) passedexam = false;
		else passedexam = true;
	}
}
