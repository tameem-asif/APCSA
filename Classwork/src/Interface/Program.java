package Interface;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args)
	{
		Example1 lulz = new DSTester();						
		System.out.println("Please enter some numbers seperated by a space");
		Scanner uno = new Scanner(System.in);
		String str = uno.nextLine();
		for(String s:str.split(" "))
		{
			lulz.addVal(Integer.parseInt(s));
		}
		uno.close();
		lulz.print();
	}
}
