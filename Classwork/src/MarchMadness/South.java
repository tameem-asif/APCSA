package MarchMadness;
public class South {
	public static void main(String[]args)
	{
		boolean match1 = predict(7);
		if(match1) System.out.println("1. Virginia"); else System.out.println("1. UMBC");
		boolean match2 = predict(43);
		if(match2) System.out.println("2. Creighton"); else System.out.println("2. Kansas St.");
		boolean match3 = predict(35);
		if(match3) System.out.println("3. Kentucky"); else System.out.println("3. Davidson");
		boolean match4 = predict(21);
		if(match4) System.out.println("4. Arizona"); else System.out.println("4. Buffalo");
		boolean match5 = predict(26);
		if(match5) System.out.println("5. Miami"); else System.out.println("5. Loyola-Chi");
		boolean match6 = predict(19);
		if(match6) System.out.println("6. Tennessee"); else System.out.println("6. Wright St.");
		boolean match7 = predict(31);
		if(match7) System.out.println("7. Nevada"); else System.out.println("7. Texas");
		boolean match8 = predict(9);
		if(match8) System.out.println("8. Cincinnati"); else System.out.println("8. Georgia St.");
	}
	public static boolean predict(int num)
	{
		int rando = (int)(Math.random()*100+1);
		if(rando<=num) return false;
		else return true;
	}
} 
