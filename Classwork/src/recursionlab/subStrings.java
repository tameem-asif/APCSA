package recursionlab;

public class subStrings {
	
	public static void main(String[]args)
	{
		substrings("ABC");
	}
	
	public static void substrings (String str)
	{
		substringHelper(str, "");
	}
	
	public static void substringHelper(String str, String soFar)
	{
		System.out.println(soFar);
		if(str.length()==0) return;
		for(int i = 0; i<str.length(); i++)
		{
			substringHelper(str.substring(i+1), soFar+String.valueOf(str.charAt(i)));
		}
		
	}

}
