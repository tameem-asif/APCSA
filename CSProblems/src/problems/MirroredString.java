package problems;

/*Q8-MirroredString:
 *JJ the Giraffe found a new magic mirror!
 *
 *Instructions
 *JJ the Giraffe looks in his magic mirror to see things his way.  
 *While you can�t print out text the way it would really look in a mirror, 
 *you can reflect the order of a string.  Your mission, should you choose to accept it, 
 *is to create a method named reverse, which reverses a string.
 *
 *public static String reverse(String input) {...}
 */

public class MirroredString {
	public static void main(String[]args)
	{
		System.out.println(reverse("JJ the Giraffe."));
	}
	public static String reverse(String input)
	{
		String temp1 = "";
		String total = "";
		int length = input.length();
		for(int i = input.length()-1; i>0; i--)
		{
			temp1 = input.substring(i, i+1);
			total+=temp1;
		}
		total += input.substring(0, 1);
		return total;
	}
}
