package recursionlab;

public class subsetSumExt {
	public static void main(String[]args) {
		int[] togive = {2, 2, 3, 4, -5};
		System.out.println(canMakeSum(togive, 1, ""));
		System.out.println(countSolutions(togive, 4));
	}
	
	public static boolean canMakeSum(int[] setOfNums, int targetNum, String str) {//gives the subset and tells if one is possible
		if(setOfNums.length==0) return false;
		if(setOfNums[setOfNums.length-1]==targetNum) { 
			str+=setOfNums[setOfNums.length-1];
			System.out.println(str);
			return true;
		}
		if(setOfNums[0]==targetNum) {
			str+=setOfNums[0];
			System.out.println(str);
			return true;
		}
		int[] shortarray = new int[setOfNums.length-1];
		for(int i = 0; i<shortarray.length; i++)
		{
			shortarray[i]=setOfNums[i];
		}
		return(canMakeSum(shortarray, targetNum, str)||canMakeSum(shortarray, targetNum-setOfNums[setOfNums.length-1], str+setOfNums[setOfNums.length-1]+" "));
	}
	
	public static int countSolutions(int[]setOfNums, int targetNum) //gives the number of solutions
	{
		if(setOfNums.length==0) return 0;
		if(setOfNums[setOfNums.length-1]==targetNum) { 
			return 1;
		}
		if(setOfNums[0]==targetNum) {
			return 1;
		}
		int[] shortarray = new int[setOfNums.length-1];
		for(int i = 0; i<shortarray.length; i++)
		{
			shortarray[i]=setOfNums[i];
		}
		return(countSolutions(shortarray, targetNum)+countSolutions(shortarray, targetNum-setOfNums[setOfNums.length-1]));
	}
}
