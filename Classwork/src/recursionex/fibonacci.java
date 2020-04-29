package recursionex;

public class fibonacci {
	public static int fibonacci(int x)
	{
		if(x==0||x==1) return 1;
		return fibonacci(x-1) + fibonacci(x-2);
		
	}
	public static void main (String[]args)
	{
		int a = fibonacci(6);
		System.out.println(a);
	}
}
