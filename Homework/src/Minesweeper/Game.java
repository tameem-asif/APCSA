package Minesweeper;

public class Game {
	
	private int row;
	private int column;
	private int mines;
	
	public void Game(int row, int column, int mines)
	{
		this.row = row;
		this.column = column;
		if(mines>=row*column)
		{
			System.out.println("Too many mines...");
			System.exit(0);
		}
		this.mines = mines;
	}
}
