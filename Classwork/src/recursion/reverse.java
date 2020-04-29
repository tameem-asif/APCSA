package recursion;

public class reverse {
	public static void main(String[]args)
	{
		reverse("hello");
	}
	public static void reverse(String a)
	{
		String temp2 = reversehelper(a, a.length()-1);
		System.out.println(temp2);
	}
	public static String reversehelper(String b, int end)
	{
		String temp = "";
		if(end<0) return (temp);
		return (temp+=b.charAt(end)+reversehelper(b, end-1));
	}
}
