package recursionex;

public class oddrecursion {
	public static int oddsum(int x)
	{
		if(x<=0) return 0;
		if(x%2==0) x--;
		return x + oddsum(x-2);
	}
	public static void main (String[]args)
	{
		int a = oddsum(26);
		System.out.println(a);
	}
}
