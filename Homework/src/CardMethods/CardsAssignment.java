package CardMethods;

import java.util.ArrayList;

public class CardsAssignment implements ICard {
	
	private int suit;
	private int rank;
	
	public static void main(String[] args)
	{
		
	}
	
	public CardsAssignment(int suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public boolean isBlack(ICard card)
	{
		if(suit==SPADES||suit==CLUBS) return true;
		return false;
	}
	
	public boolean isPair(ICard first, ICard second)
	{
		if(first.getRank()==second.getRank()) return true;
		return false;
	}
	
	public boolean isStraight(ICard[] hand)
	{
		boolean order = true;
		boolean suits = false;
		int suit1 = hand[0].getSuit();
		for(ICard x : hand)
		{
			if(x.getSuit()!=suit1)
			{
				suits = true;
				break;
			}
		}
		
		for(int i = 1; i<hand.length; i++)
		{
			if(hand[i].getRank()<hand[i-1].getRank()) continue;
			else
			{
				order = false;
				break;
			}
		}
		
		return(order&&suits);
	}
	
	public ArrayList<Integer> handTotal(ICard[] hand)
	{
		ArrayList<Integer> cards = new ArrayList<Integer>();
		for(ICard x:hand)
		{
			if(x.getRank()!=1&&x.getRank()!=11&&x.getRank()!=12&&x.getRank()!=13)
			{
				cards.add(x.getRank());
			}
			else if(x.getRank()!=1)
			{
				cards.add(10);
			}
			else cards.add(1);
		}
		return cards;
	}
	
	public boolean hitStay(ICard[] hand)
	{
		ArrayList<Integer> cards = handTotal(hand);
		int handTotal = 0;
		int numberaces = 0;
		for(ICard x:hand)
		{
			if(x.getRank()==1) numberaces++;
		}
		for(Integer x:cards)
		{
			handTotal+=x;
		}
		if(handTotal>=21) return false;
		if(handTotal<21-9&&numberaces>=1&&handTotal+9<=21) handTotal+=9;
		if(21-handTotal>3) return true;
		return false;
		
	}
	
}
