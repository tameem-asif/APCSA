package Interface;


public class DSTester implements Example1, Example2 {
	
	private double total;
	private int count;
	private int large;
	private int small;

	
	public void addVal (int x)
	{
		//computes the total, the average, the large and small values of a sequence of integers without the use of an array
		total += x;
		count = count +1;
		if(count == 1) {small = x; large = x;}
		if(small>x) small = x;
		if(large<x) large = x;
		
	}
	
	public void print()
	{
		System.out.println("The sum is: "+getTotal());
		System.out.println("The average is: "+getAve());
		System.out.println("The largest value is: "+getLarge());
		System.out.println("The smallest value is: "+getSmall());
	}

	public double getAve()
	{
		//computes the average of the total
		return total/count;
	}

	public int getTotal()
	{
		//returns total in integer form
		return (int)total;
	}

	public int getLarge()
	{
		//returns the largest number sent
		return large;
	}

	public int getSmall()
	{
		//returns the smallest number sent
		return small;
	}
	
}
