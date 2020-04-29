package CalendarStuff;

import java.util.*;
import java.text.*;

public class AddingDays {
	public static void main(String[] args)
	{
		Scanner dates = new Scanner(System.in);
		System.out.println("Please enter the month of the original date");
		int month = dates.nextInt();
		System.out.println("Please enter the day of the original date");
		int day = dates.nextInt();
		System.out.println("Please enter the year of the original date");
		int year = dates.nextInt();
		System.out.println("Please enter the number of days to be added");
		int toAdd = dates.nextInt();
		addDays(month-1, day, year, toAdd);
	}
	
	public static void addDays(int month, int day, int year, int toAdd)
	{
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    cal.set(Calendar.DATE, day);
	    cal.add(Calendar.DAY_OF_MONTH, toAdd);
	    
	    System.out.println(cal.getTime());
	}
	
}
