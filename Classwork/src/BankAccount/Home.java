package BankAccount;

public class Home {
	int homeNumber;
	String streetName;
	int appNum;
	String city;
	String state;
	int zippy;
	
	public static void main(String[]args)
	{
		Home home1 = new Home(123, "Daisy Street", "Lawrenceville", "GA", 12345);
		Home home2 = new Home(123, "Daisy Street", 90, "Lawrenceville", "GA", 23456);
		home1.compareTo(home2);
	}
	
	public Home(int homeNumber, String streetName, int appNum, String city, String state, int zippy)
	{
		this.homeNumber=homeNumber;
		this.streetName=streetName;
		this.appNum = appNum;
		this.city = city;
		this.state = state;
		this.zippy = zippy;
	}
	
	public Home(int homeNumber, String streetName, String city, String state, int zippy)
	{
		this.homeNumber=homeNumber;
		this.streetName=streetName;
		this.city = city;
		this.state = state;
		this.zippy = zippy;
	}
	
	public void print()
	{
		System.out.println(this.homeNumber+" "+streetName);
		System.out.println(city+", "+state+" "+zippy);
	}
	
	public void compareTo(Home lulz)
	{
		if(lulz.zippy>zippy)
		{
			System.out.println("Home 2 is farther than home 1");
		}
		else if(lulz.zippy==zippy)
		{
			System.out.println("Home 2 is in a similar area to Home 1");
		}
		else
		{
			System.out.println("Home 1 is farther than Home 2");
		}
	}
}
