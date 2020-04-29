package recursionlab;

public class subsetSum {
	public static void main(String[]args) {
		int[] togive = {2, 2, 3, 4, -5};
		System.out.println(canMakeSum(togive, 1));
	}
	public static boolean canMakeSum(int[] setOfNums, int targetNum) {
		if(setOfNums.length==0) return false;
		if(setOfNums[setOfNums.length-1]==targetNum||setOfNums[0]==targetNum) { 
			return true;
		}
		int[] shortarray = new int[setOfNums.length-1];
		for(int i = 0; i<shortarray.length; i++)
		{
			shortarray[i]=setOfNums[i];
		}
		return(canMakeSum(shortarray, targetNum)||canMakeSum(shortarray, targetNum-setOfNums[setOfNums.length-1]));
	}
}
