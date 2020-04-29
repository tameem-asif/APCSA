package recursionlab;

public class balancingParen {
	
	public static void main(String[]args)
	{
		System.out.println(isBalanced("[(){}]"));
	}
	
	public static boolean isBalanced(String str)
	{
		if(str.equals("")) return true;
		if(str.contains("[]"))
		{
			str = str.replace("[]", "");
		}
		else if(str.contains("{}"))
		{
			str = str.replace("{}", "");
		}
		else if(str.contains("()"))
		{
			str = str.replace("()", "");
		}
		else return false;
		return isBalanced(str);
	}

}
