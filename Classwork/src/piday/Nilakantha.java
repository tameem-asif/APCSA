package piday;

import java.util.Scanner;

public class Nilakantha {
	
	public static double recursion(int i)
	{
		double pi = 3;
		int x=0;
		if(x>i) return pi;
		if (x % 2 == 0) 
		   {
		      pi = (double)(pi +(double)4*(1/(((double)(2*x+2))*((double)(2*x+3))*((double)(2*x+4)))));
		   } 
		else 
		   {
			  pi = (double)(pi - (double)4*(1/((double)(2*x+2)*(double)(2*x+3)*(double)(2*x+4))));
		   }
		return recursion(x++);
	}
	
	public static void main(String[]args)
	{
		//double Pi = 4*Sigma(1, n, n^2/2n+1);
		Scanner input = new Scanner (System.in);
		int i = input.nextInt(); // value of i user entered
		double pi = 3;
		for (int x = 0; x < i; x++)
		{
		   if (x % 2 == 0) 
		   {
		      pi = (double)(pi +(double)4*(1/(((double)(2*x+2))*((double)(2*x+3))*((double)(2*x+4)))));
		   } 
		   else 
		   {
			  pi = (double)(pi - (double)4*(1/((double)(2*x+2)*(double)(2*x+3)*(double)(2*x+4))));
		   }
		}
		System.out.println(pi);
		recursion(1000000);
	}//main
}//class end

