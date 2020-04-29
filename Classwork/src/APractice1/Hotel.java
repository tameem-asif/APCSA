package APractice1;

import java.util.*;

public class Hotel {
	private Reservation[] rooms;
	private ArrayList<String> waitList = new ArrayList<String>();
	
	public Hotel(Reservation[] y)
	{
		rooms = y;
	}
	public Reservation requestRoom(String guestname)
	{
		for(int i = 0; i<rooms.length; i++)
		{	
			if(rooms[i]==null)
			{
				rooms[i] = new Reservation(guestname, i);
				return rooms[i];
			}
		}
	waitList.add(guestname);
	return null;
	}
	
	public Reservation cancelAndReassign(Reservation res)
	{
		if (waitList.size()==0) {
			rooms[res.getRoomNumber()] = null;
			return rooms[res.getRoomNumber()];
		}
		rooms[res.getRoomNumber()] = new Reservation(waitList.remove(0), res.getRoomNumber());
		return rooms[res.getRoomNumber()];
	}
	
	public void printRes()
	{
		for(Reservation x:rooms)
		{
			System.out.println("Room "+x.getRoomNumber()+": "+x.getGuestName());
		}
	}
	
	public void printWaitlist()
	{
		System.out.println("Waitlist: ");
		for(String x:waitList)
		{
			System.out.println(x);
		}
	}
	
	public Reservation getRes(int num)
	{
		return rooms[num];
	}
}
