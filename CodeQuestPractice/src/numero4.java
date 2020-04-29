import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class numero4 {
	private static final String fileName = "Prob04.in.txt";
	public static void main(String[] args) throws Exception
	{
		File inFile = new File(fileName);
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		//String input = null;
		
		
		String inp = "";
		int count = 0;
		String mid = "";
		char temp = 'a';
		while((inp = br.readLine()) != null)
		{
			mid ="";
			for(int i = 0; i<=inp.length(); i++)
			{
				if(inp.charAt(i)!='a'||inp.charAt(i)!='e'||inp.charAt(i)!='i'||inp.charAt(i)!='o'||inp.charAt(i)!='u')
				{
					mid+=inp.charAt(i);
					count++;
				}
				else
				{
					break;
				}
			}
			
		}
	}
}
