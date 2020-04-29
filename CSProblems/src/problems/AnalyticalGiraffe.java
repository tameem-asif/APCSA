package problems;

/*INSTRUCTIONS:
 *JJ the Giraffe wants to help his teachers grade and analyze their test results, 
 *but his head is too tall to see the grades! Help him calculate the mean of his class� grades! 
 *Instructions
 *Given the array of integers that represents a class of  students grades, 
 *write the method average that returns the average grade of the class.
 */

public class AnalyticalGiraffe {
	
	public static void main(String[] args)
	{
		int[] test = {96, 87, 80, 73, 90, 78, 89};
		System.out.println(average(test));
	}
	
	public static int average(int[] input)
	{
		int total = 0;
		for(int i = 0; i<input.length; i++)
		{
			total+=input[i];
		}
		return total/input.length;
	}
	  
}
