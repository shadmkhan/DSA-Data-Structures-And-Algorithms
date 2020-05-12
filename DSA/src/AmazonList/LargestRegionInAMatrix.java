package AmazonList;

public class LargestRegionInAMatrix {
	public static void main(String[] args) {
		int arr[][] = new int [][] {{0,0,1,1,0},
									{1,0,1,1,0},
									{1,1,0,1,0},
									{1,1,1,0,1}};
		findLargestLegion(arr);
	}

	static public void findLargestLegion(int arr[][])
	{
		int n=arr.length;
		int m=arr[0].length;
		
		boolean visited[][]=new boolean[n][m];
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				if(arr[i][j]==1 && visited[i][j]!=true)
				{
					System.out.println(dfs(arr, visited, i, j,1));
					
				}
					
			}
			
		}
		
		
		
	}
	
	static public int dfs(int arr[][],boolean visited[][],int x, int y, int count)
	{
		
		int moveX[]=new int[]{0,1,1,-1,0,-1,-1,1};
		int moveY[]=new int[]{1,0,1,0,-1,-1,1,-1};
		visited[x][y]=true;
		
		for (int i = 0; i < moveX.length; i++) 
		{
			int newX=x+moveX[i];
			int newY=y+moveY[i];
			
			if(newX>=arr.length||newX<0||newY>=arr[0].length||newY<0) break;
			
			if(!visited[x+moveX[i]][y+moveY[i]] && arr[x+moveX[i]][y+moveY[i]]==1)
				count = dfs(arr,visited,x+moveX[i],y+moveY[i],count)+1;
			
			
		}
		return count;
		
	}
}
