package AmazonList;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
	public static void main(String[] args) {
		char arr[][]=new char[][]{{'S','1','X','X','1'},
								  {'X','1','X','1','X'},
								  {'X','1','X','1','1'},
								  {'1','1','X','X','1'},
								  {'1','1','1','1','E'}};

		boolean visited[][]=new boolean[arr.length][arr[0].length];

		//System.out.println(findShortestPath(arr,visited,1,0,3,3,0));
		System.out.println(findShortestPathBFS(arr,0,0));
				
	}

	/*private static int findShortestPath(char arr[][], boolean visited[][], int startX, int startY, int endX, int endY,int count) 
	{
		if(arr[startX][startY]=='E') return 0;
		System.out.println(arr[startX][startY]);
		int moveX[]=new int[]{0,0,1,-1};
		int moveY[]=new int[]{1,-1,0,0};
		
		visited[startX][startY]=true;
		
		
		for (int i = 0; i < moveX.length; i++) 
		{
			int newX=startX+moveX[i];
			int newY=startY+moveY[i];
			if(newX>0&&newX<arr.length&&newY>0&&newY<arr[0].length&&!visited[newX][newY]&&arr[newX][newY]!='X')
			{
					count=findShortestPath(arr,visited, newX, newY, endX, endY,count)+1;
			}
		}
			
			return count;
		
	}*/
	
	
	private static int findShortestPathBFS(char arr[][], int startX, int startY)
	{
		if(arr[startX][startY]=='E') return 0;
		int moveX[]=new int[]{0,0,1,-1};
		int moveY[]=new int[]{1,-1,0,0};
		boolean visited[][]=new boolean[arr.length][arr[0].length];
		Queue<QNode> qNodes = new LinkedList<>();
		qNodes.add(new QNode(startX,startY,0));
		while(!qNodes.isEmpty())
		{
			QNode currNode=qNodes.remove();
			int currX=currNode.x;
			int currY=currNode.y;
			int currDistance = currNode.distance;
			visited[currX][currY]=true;
			//System.out.println(arr[currX][currY]);
			if(arr[currX][currY]=='E') return currDistance;
			
			for (int i = 0; i < moveX.length; i++) 
			{
				int newX=currX+moveX[i];
				int newY=currY+moveY[i];
				
				if(newX>=0&&newX<arr.length&&newY>=0&&newY<arr[0].length&&!visited[newX][newY]&&arr[newX][newY]!='X')
				{
					qNodes.add(new QNode(newX,newY,currDistance+1));
				}
			}
				
			
		}
		
		return -1;
	}
	private static class QNode
	{
		int x;
		int y;
		int distance;
		QNode(int x,int y, int distance)
		{
			this.x=x;
			this.y=y;
			this.distance=distance;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
