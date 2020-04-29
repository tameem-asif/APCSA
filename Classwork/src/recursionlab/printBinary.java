package recursionlab;

public class printBinary {
	public static void main(String[]args)
	{
		printInBinary(96);
	}
	public static int printInBinary(int numthing, int count, int code)
	{
		int binary = code;
		binary += (int)(numthing%2)*((int)Math.pow(10, count));
		if(numthing/2==0) return binary;
		return printInBinary(numthing/2, count+1, binary);
	}
	public static void printInBinary(int number)
	{
		int count = 0;
		int binary = 0;
		System.out.println(printInBinary(number, count, binary));
	}
}