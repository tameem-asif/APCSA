package CardMethods;

import java.util.ArrayList;

public interface ICard {
	public static final int SPADES = 0;
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;
	// returns a value like ICard.SPADES
	public int getSuit();
	// returns a value between 1 (ace) and 13 (king)
	public int getRank();
	public boolean isBlack(ICard card);
	public boolean isPair(ICard first, ICard second);
	public boolean isStraight(ICard[] hand);
	public ArrayList<Integer> handTotal(ICard[] hand);
	public boolean hitStay(ICard[] hand);
}
