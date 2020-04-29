package problems;

/*Q6-Order Me Up:
 *JJ the Giraffe only likes integers that are strictly increasing or else he gets the shivers and feels sad.
 *Predict whether JJ the Giraffe will be happy when you give him a set of three numbers!
 *
 *Instructions
 *Given three ints, a b c, write a method isIncreasing that returns true if they are in strict increasing order.
 *
 *public static boolean isIncreasing(int a, int b, int c){...}
 */

public class OrderMeUp {
	
	public static void main(String[]args)
	{
		System.out.println(isIncreasing(2, 5, 4
				));
	}
	
	public static boolean isIncreasing(int a, int b, int c)
	{
		if(a<b&&b<c&&a<c)
		{
			return true;
		}
		else return false;
	}
}
