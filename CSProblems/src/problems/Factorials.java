package problems;

/*Q2-Factorials:
 *JJ the Giraffe can�t stop yelling out his numbers with exclamation marks! 
 *Help him be more mathematically literate and teach him what factorials are!
 *
 *Instructions
 *A factorial is the product of a given positive integer (n) 
 *multiplied by all lesser positive integers and is represented as n! 
 *For example:
 * 
 *4! = 4 x 3 x 2 x 1 = 24
 * 
 *Your task is to write a method (called factorial)  which will calculate any given factorial
 *
 *public static int factorial(int n){...}
 *
 */

public class Factorials {
	
	public static void main(String[]args)
	{
		System.out.println(factorial(4));
		System.out.println(factorial(10));
	}
	
	public static int factorial(int n)
	{
		int total = 1;
		for(int i = n; i>0; i--)
		{
			total*=i;
		}
		return total;
	}
	
}
