package palindrome;

public class Palindrome {
	public static void main (String[]args)
	{
		System.out.println("Is poop a palindrome? " + isPalindrome2("poop"));
		System.out.println("Is poops a palindrome? " + isPalindrome2("poops"));
		System.out.println("Is a a palindrome? " + isPalindrome2("a"));
		System.out.println("Is racecar a palindrome? " + isPalindrome2("racecar"));
	}
	public static boolean isPalindrome2(String s)
	{
		return isPalindrome(s, 0, s.length()-1);
	}
	public static boolean isPalindrome (String s, int low, int high)
	{
		if(high<=low) //Base Case
			return true;
		else if (s.charAt(low)!=s.charAt(high))//base case
			return false;
		else return isPalindrome(s, low+1, high-1);
	}
}
