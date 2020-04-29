package TwoDimArrays;

public class GradeExam {
	public static void main(String args[])
	{
		int count = 0;
		char[][] answers = 
			{
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
			};
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for(int i=0; i<answers.length; i++)
		{
			for(int j = 0; j<keys.length;j++)
			{
				if(answers[i][j]==keys[j])
				{
					count++;
				}//if
			}//for 2
			System.out.println("Student "+i+"'s correct count is "+count);
			count = 0;
		}//for 1
	}//main

}//class grade exam