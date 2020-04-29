package Minesweeper;

public class Main {
	public static void main(String[]args)
	{
		int length = 10;
		int width = 10;
		int numMines = 40;
		MinesweeperGame a = new MinesweeperGame(length-1, width-1, numMines);
		a.addmines(numMines);
		for(int i = 0; i<length-1; i++)
		{
			for(int j = 0; j<width-1; j++)
			{
				System.out.print(a.getvalue(i, j) + "\t");}
				System.out.println();
			}
	}
}
