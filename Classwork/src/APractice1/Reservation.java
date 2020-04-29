package APractice1;

public class Reservation {
	private int roomnum;
	private String name;
	public Reservation(String guestName, int roomNumber)
	{
		roomnum = roomNumber;
		name = guestName;
	}
	
	public int getRoomNumber()
	{
		return roomnum;
	}
	
	public String getGuestName()
	{
		return name;
	}
}
