package CardTrick;
import java.util.*;
public class CardTrick {
	
	public static void playagain()
	{
		System.out.println("Would you like to play again? Enter y for yes and n for no");
		Scanner again = new Scanner(System.in);
		String play = again.nextLine();
		if(play.equalsIgnoreCase("y"))
		{
			ActuallyPlayTheGame();
		}//if 1
		else if(play.equalsIgnoreCase("n"))
		{
			System.exit(0);
		}//else 1
		else
		{
			System.out.println("That is not a valid input.");
			playagain();
		}//else 2
	}
	
	public static void printrows(ArrayList<String> deck1, ArrayList<String> deck2, ArrayList<String> deck3)
	{
		System.out.println("Row1 is: "+deck1);
		System.out.println("Row2 is:"+deck2);
		System.out.println("Row3 is:" + deck3);
	}
	
	public static int scan()
	{
		Scanner num1 = new Scanner(System.in);
		int toreturn = num1.nextInt();
		if(toreturn!=1 && toreturn!=2 && toreturn!=3)
		{
			System.out.println("That was not a valid input. Please try again");
			scan();
		}
		return toreturn;
	}
		
	public static void ActuallyPlayTheGame()
	{
		ArrayList<String> deck1 = new ArrayList<String>();
		ArrayList<String> deck2 = new ArrayList<String>();
		ArrayList<String> deck3 = new ArrayList<String>();
		ArrayList<String> deck4 = new ArrayList<String>();
		deck1.add("♣A");
		deck1.add("♦J");
		deck1.add("♠9");
		deck1.add("♣6");
		deck1.add("♣7");
		deck1.add("♦4");
		deck1.add("♠6");
		deck2.add("♣3");
		deck2.add("♠5");
		deck2.add("♥8");
		deck2.add("♠2");
		deck2.add("♠7");
		deck2.add("♠4");
		deck2.add("♦6");
		deck3.add("♠A");
		deck3.add("♥4");
		deck3.add("♠9");
		deck3.add("♣8");
		deck3.add("♦3");
		deck3.add("♦8");
		deck3.add("♣4");
		printrows(deck1, deck2, deck3);
		System.out.println("Out of all these cards, please pick one card and memorize it.");
		System.out.println("Please enter only the number of the row your card is in");
		int rowone = scan();
		if (rowone==1)
		{
			deck4.addAll(deck2);
			deck4.addAll(deck1);
			deck4.addAll(deck3);
		}//if 1
		else if (rowone==2)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck2);
			deck4.addAll(deck3);
		}//if 2
		else if (rowone==3)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck3);
			deck4.addAll(deck2);
		}//if 3
		deck1.clear(); deck2.clear(); deck3.clear();
		for (int i = 0; i<=20; i++)
		{
			if(i==0||i==3||i==6||i==9||i==12||i==15||i==18)
			{
				deck1.add(deck4.get(i));
			}//if deck1
			if(i==1||i==4||i==7||i==10||i==13||i==16||i==19)
			{
				deck2.add(deck4.get(i));
			}//if deck2
			if(i==2||i==5||i==8||i==11||i==14||i==17||i==20)
			{
				deck3.add(deck4.get(i));
			}//if deck3
		}
		deck4.clear();
		printrows(deck1, deck2, deck3);
		System.out.println("Please enter only the number of the row your card is in");
		rowone = scan();
		if (rowone==1)
		{
			deck4.addAll(deck2);
			deck4.addAll(deck1);
			deck4.addAll(deck3);
		}//if 1
		else if (rowone==2)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck2);
			deck4.addAll(deck3);
		}//if 2
		else if (rowone==3)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck3);
			deck4.addAll(deck2);
		}//if 3
		deck1.clear(); deck2.clear(); deck3.clear();
		for (int i = 0; i<=20; i++)
		{
			if(i==0||i==3||i==6||i==9||i==12||i==15||i==18)
			{
				deck1.add(deck4.get(i));
			}//if deck1
			if(i==1||i==4||i==7||i==10||i==13||i==16||i==19)
			{
				deck2.add(deck4.get(i));
			}//if deck2
			if(i==2||i==5||i==8||i==11||i==14||i==17||i==20)
			{
				deck3.add(deck4.get(i));
			}//if deck3
		}
		deck4.clear();
		printrows(deck1, deck2, deck3);
		System.out.println("Please enter only the number of the row your card is in");
		rowone = scan();
		if (rowone==1)
		{
			deck4.addAll(deck2);
			deck4.addAll(deck1);
			deck4.addAll(deck3);
		}//if 1
		else if (rowone==2)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck2);
			deck4.addAll(deck3);
		}//if 2
		else if (rowone==3)
		{
			deck4.addAll(deck1);
			deck4.addAll(deck3);
			deck4.addAll(deck2);
		}//if 3
		deck1.clear(); deck2.clear(); deck3.clear();
		for (int i = 0; i<=20; i++)
		{
			if(i==0||i==3||i==6||i==9||i==12||i==15||i==18)
			{
				deck1.add(deck4.get(i));
			}//if deck1
			if(i==1||i==4||i==7||i==10||i==13||i==16||i==19)
			{
				deck2.add(deck4.get(i));
			}//if deck2
			if(i==2||i==5||i==8||i==11||i==14||i==17||i==20)
			{
				deck3.add(deck4.get(i));
			}//if deck3
		}
		System.out.println("I am magical...your card is: "+deck2.get(3));
		playagain();
	}
	
	public static void main(String[] args)
	{
		ActuallyPlayTheGame();
	}//main
}//class
