package Interface;

public class DS
{
	private double total;
	private int count;
	private int large;
	private int small;

	public static void main(String[] args)
	{

		DS data = new DS();

		data.addVal(1);
		data.addVal(2);
		data.addVal(-3);
		data.addVal(4);

	 	int sum = data.getTotal();
		double avg = data.getAve();
		int larg = data.getLarge();
		int sml = data.getSmall();

		System.out.println("The Sum is: " + sum);
		System.out.println("Expected: 4");

		System.out.println("The Average is: " + avg);
		System.out.println("Expected: 1");

		System.out.println("The Largest value is: " + larg);
		System.out.println("Expected: 4");

		System.out.println("The smallest value is: " + sml);
		System.out.println("Expected: -3");
	}
	
	public DS()
	{
		total = 0;
		count = 0;
		large = 0;
		small = 0;
	}

	public void addVal (int x)
	{
		//computes the total, the average, the large and small values of a sequence of integers without the use of an array
		total += x;
		count = count +1;
		if(count == 1) {small = x; large = x;}
		if(small>x) small = x;
		if(large<x) large = x;
		
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