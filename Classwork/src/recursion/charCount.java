package recursion;

public class charCount {
	public static void main(String[]args)
	{
		int temp = count("hi my name is Tameem", 'm');
		System.out.println(temp);
	}
	public static int charCounter(String a, char b, int c)
	{
		int count = 0;
		if(c<0) return 0;
		if(a.charAt(c)==b) count++;
		return (count+charCounter(a, b, c-1));
	}
	public static int count(String a, char b)
	{
		a = a.toLowerCase();
		return charCounter(a, b, a.length()-1);
	}
}
