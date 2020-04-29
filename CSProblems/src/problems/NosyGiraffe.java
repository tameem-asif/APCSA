package problems;

/*Q7-NosyGiraffe:
 *JJ the Giraffe is nosy and wants to know who got the highest grade on the recent test.
 *Help him be nosy (it�s too far off the ground to smell anything) by coding him a method!
 *
 *Instructions
 *Given two arrays, one integer array representing grades and one String array representing 
 *the corresponding student�s name, create method noseAround that print the name of the student 
 *with the highest grade with their grade following. JJ has rigged the test so that there will 
 *never be two students with the same grade.
 *
 *public static void noseAround(int[] grades, String[] names) {...}
 */

public class NosyGiraffe {
	public static void main(String[]args)
	{
		int[] input1 = {60, 90, 89};
		String[] input2 = {"JJ the Giraffe", "Jeff", "Hanna"};
		noseAround(input1, input2);
	}
	public static void noseAround(int[] grades, String[] names)
	{
		int highest = 0;
		int index = 0;
		for(int i = 0; i<grades.length; i++)
		{
			if(grades[i]>highest)
			{
				highest = grades[i];
				index = i;
			}
		}
		System.out.println(names[index]+" - "+grades[index]);
	}
}
