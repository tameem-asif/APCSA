package recursionex;

public class example1 {
	public static int sum(int x)
	{
		if(x==1) return 1;
		System.out.println(x);
		return x + sum(x-1);
	}
	public static void main (String[]args)
	{
		int a = sum(6);
		System.out.println(a);
	}
}
