package DriversEd;

public class Georgia extends Driver{
		public Georgia(String name, int driverAge, int issueYear)
		{
			super(name, driverAge, issueYear);
		}
		public void validateLicense()
		{
			if(driverAge>=16)
			{
				expirationYear = issueYear+3;
				validLicense = true;
				stateOfLicense = "Georgia";
			}
			else validLicense = false;
		}
}
