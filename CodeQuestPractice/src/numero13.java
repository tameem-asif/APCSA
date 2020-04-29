import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class numero13 {
	static ArrayList<ArrayList<Integer>> row = new ArrayList<ArrayList<Integer>>();
	
	private static final String fileName = "Prob13.in.txt";
	static int lowest = Integer.MAX_VALUE;
	static int lowCount = 0;
	static ArrayList<Integer> getChoices(int currentNode, int nextRow){
		ArrayList<Integer> result = new ArrayList();
		if(row.get(nextRow).size() == 3) {
			return row.get(nextRow);
		}else {
			for(int i = 0; i < 2; i ++)
				result.add(row.get(--nextRow).get(currentNode+i));
			return result;
		}
		
	}
	public static void function(int currectDifc, ArrayList<Integer> choices, int myrow, int currentNode) {
		if(myrow == 10) {
			if(currectDifc < lowest) {
				lowest = currectDifc;
				lowCount++;
				
			}else if(currectDifc == lowest) {
				lowCount++;
			}else {
				for(int i = 0; i < choices.size();  i++) {
					function(currectDifc + choices.get(i), getChoices(currentNode, currentNode++), myrow++, i++);
				}
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		File inFile = new File(fileName);
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		String input = null;
		
		

		for(int i = 0; i < 2; i++) {
		String one = br.readLine();
		String onearray[] = one.split(" ");
		row.add(new ArrayList<Integer>());
		for(String s : onearray) {
			row.get(i).add(Integer.parseInt(s));
		}
		}
		
		for(int i = 0; i < 2; i++) {
			function(0, row.get(0), 0, i);
		}
		System.out.println(lowest);
		
	}
}
