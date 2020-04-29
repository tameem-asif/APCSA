package TwoDimArrays;

import java.util.Scanner;
import java.lang.Math;

public class battleship {
	
	public static void loop(char[][] boardd)
	{
		for(int i = 0; i<boardd.length; i++)
		{
			for(int j = 0; j<boardd.length; j++)
			{
				System.out.print(boardd[i][j]);
			}//for 2
			System.out.println();
		}//for 1
	}
	
	public static void main(String args[])
	{
		int shipcount = 0;
		int shipone = 0;
		int shiptwo = 0;
		int first = 0;
		int second = 0;
		char[][] ships = new char[10][10];
		for(int i = 0; i<10; i++)
		{
			shipone = (int)(Math.random()*10);
			shiptwo = (int)(Math.random()*10);
			ships[shipone][shiptwo] = '*';
		}//for ships
		char[][] board = 
			{
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'}
			};
		System.out.println("This is the board: ");
		loop(board);
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers 0-9 with a space in between");
		first = input.nextInt();
		second = input.nextInt();
		for(;shipcount<10;)
		{
			if((first>=10)||(first<0)||(second>=10)||(first<0))
			{
				System.out.println("That is out of bounds");
				input = new Scanner(System.in);
				System.out.println("Please enter two 0-9 integers with a space in between");
				first = input.nextInt();
				second = input.nextInt();
			}//check out of bounds
			if((board[first][second]=='+')||(board[first][second]=='-'))
			{
				System.out.println("You have already inputted that. Please input another number");
				input = new Scanner(System.in);
				System.out.println("Please enter two 0-9 integers with a space in between");
				first = input.nextInt();
				second = input.nextInt();
			}//if check already input
			if(board[first][second]==ships[first][second])
			{
				board[first][second]='+';
				shipcount++;
			}//check hit
			else
			{
				board[first][second] = '-';
			}
			loop(board);
			input = new Scanner(System.in);
			System.out.println("Please enter two 0-9 integers with a space in between");
			first = input.nextInt();
			second = input.nextInt();
	}//main
	}
	}
