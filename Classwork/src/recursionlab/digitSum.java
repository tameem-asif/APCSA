package recursionlab;

public class digitSum {
	public static void main(String[]args)
	{
		System.out.println(digitSum(1234));
	}
	public static int digitSum(int n)
	{
		if(n==0) return 0;
		return n%10+digitSum(n/10);
	}
}
