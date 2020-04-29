package problems;

/*Q5-RobotRoute::
 *JJ the Giraffe decided to join Robotics one day! 
 *Yet wherever his robot goes, it keeps on going back to the same place!
 *Help him decide if his robot has ended up in the same place!
 *
 *Instructions
 *Initially, JJ�s Robot is at position (0, 0). 
 *Given a sequence of its moves, judge if this robot moves back to the original place.
 *
 *The move sequence is represented by a string. 
 *And each move is represent by a character. 
 *The valid robot moves are R (Right), L(Left), U (Up) and D (down). 
 *Each move is the same distance away. 
 *Given a string of moves, write a method samePlace that returns true or false representing whether 
 *the robot ends up in the same place it started. 
 *
 *public static boolean samePlace(String moves){...}
 *
 */

public class RobotRoute {
	
	public static void main(String[]args)
	{
		System.out.println(samePlace("RURDLL"));
	}
	
	public static boolean samePlace(String moves)
	{
		int numberr = 0;
		int numberl = 0;
		int numberu = 0;
		int numberd = 0;
		for(int i = 0; i<moves.length(); i++)
		{
			if(moves.charAt(i)=='R')
			{
				numberr++;
			}
			if(moves.charAt(i)=='L')
			{
				numberl++;
			}
			if(moves.charAt(i)=='D')
			{
				numberd++;
			}
			if(moves.charAt(i)=='U')
			{
				numberu++;
			}
		}
		if(numberr==numberl&&numberd==numberu)
		{
			return true;
		}
		else return false;
	}
}
