package AmazonProbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindIslands {
	
	public static void main(String[] args) {
//		int arr[][] = new int[][]  {{1,0,0,0},
//									{1,1,0,1},
//									{1,0,0,1},
//									{1,0,0,1}};
//									
//									
									
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder res = new StringBuilder();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int arr[][] = new int[x][y];
		{
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					arr[i][j]=scanner.nextInt();
				}
			}
		} 
		scanner.close();
		
		
		ArrayList<Integer> arrIslands = new ArrayList<Integer>();
		findIslands(arr, arrIslands);
		Collections.sort(arrIslands);
		System.out.println(arrIslands.get(arrIslands.size()-1));
		
									
	}
	static int findIslands(int[][] arr, ArrayList<Integer> arrIslands)
	{
		boolean visited[][]=new boolean[arr.length][arr[0].length];
		 
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==1 && !visited[i][j])
				{
					arrIslands.add(recursiveIslandMapping(arr, i, j, visited,1));
					
					count++;
				}
			}
			
		}
		
		return count;
		
		
	}
	
	static int recursiveIslandMapping(int[][]arr, int  currX, int currY, boolean[][] visited,int count)
	{
		
		
		
		int rowNbr[] = {  0, 0, -1,1, -1,-1, 1,  1};
	    int colNbr[] = { -1, 1, 0, 0,-1, 1, -1,  1};
	    visited[currX][currY]=true;
	    
	    
	    
	    for (int i = 0; i < colNbr.length; i++) {
	    	if(safe(arr, currX+rowNbr[i], currY+colNbr[i], visited))
		    	{
	    			
		    		count= 1+recursiveIslandMapping(arr, currX+rowNbr[i], currY+colNbr[i], visited,count);
		    	}	    		
			}
	    
	    return count;
	    
	}
	static boolean safe(int[][] arr, int currX, int currY, boolean[][]visited)
	{
		int x = arr.length;
		int y = arr[0].length;
		if(currX<0||currY<0||currX>=x||currY>=y)
			return false;
		if((visited[currX][currY])||(arr[currX][currY]!=1))
			return false;
		return true;
	}

}
