package Minesweeper;

public class MinesweeperGame {
	private int rows;
	private int col;
	private int mines;
	private int[][] board;
	
	public MinesweeperGame(int rows, int col, int mines)
	{
		this.rows = rows;
		this.col = col;
		this.mines = mines;
		board = new int[this.rows][this.col];
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<col; j++)
			{
				board[i][j] = 0;
			}
		}
	}
	
	public void addmines(int mines)
	{
		for(int i = 0; i<mines; i++)
		{
			int rando1 = (int) (Math.random()*rows);
			int rando2 = (int) (Math.random()*col);
			board[rando1][rando2] = -1;
			addValues(rando1, rando2);
		}
	}
	
	public void addValues(int row, int column)
	{
		for(int i = -1; i<=1; i++)
		{
			if(row-1>=0&&column-1>=0&&column+1<=col)
			{
				board[row-1][column-i]+=1;
			}
		}
		
		for(int i = -1; i<=1; i++)
		{
			if(row-1>=0&&column-1>=0&&column+1<=col&&row+1<=rows)
			{
				board[row+1][column-i]+=1;
			}
		}
		
		for(int i = -1; i<=1; i++)
		{
			if(row-1>=0&&column-1>=0&&column+1<=col)
			{
				if(i!=0)
				{
					board[row][column-i]+=1;
				}
			}
		}
	}
	
	public int getvalue(int row, int col)
	{
		return board[row][col];
	}
}
