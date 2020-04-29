import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class numero14 {
	private static final String fileName = "Prob01.in.txt";
	public static void main(String[] args) throws Exception
	{
		File inFile = new File(fileName);
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		String input = null;
		
		int[][]row;
		
		int inp = 0;
		while((input = br.readLine()) != null)
		{
			inp = Integer.parseInt(input);
			if (((inp % 3) == 0) && ((inp % 7)==0))
			{
				System.out.println("CODEQUEST");
			}
			else if((inp % 3)==0)
			{
				System.out.println("CODE");
			}
			else if ((inp % 7)==0)
			{
				System.out.println("QUEST");
			}
			else
			{
				System.out.println(inp);
			}
		}
	}
}
