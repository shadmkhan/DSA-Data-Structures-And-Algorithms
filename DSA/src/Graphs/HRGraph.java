package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class HRGraph {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int v = scanner.nextInt();
		int e=  scanner.nextInt();
		StringBuilder res = new StringBuilder();
		Graph1 g=new Graph1(v+1);
		while(e>0)
		{
			
			g.addEdgeBothSides(scanner.nextInt(),scanner.nextInt());
			e--;
		} 
		
		//g.printGraph();
		res.append(g.computeTreeCount()+"\n");
		scanner.close();
		System.out.println(res);
		//g.printGraph();
		//g.printGraph();
	}
}
class Graph1
{
	int n;
	int arrEdges[][];
	public Graph1(int n)
	{
		
		this.n=n;
		arrEdges=new int[n][n];
		
	}
	public void addEdgeBothSides(int from,int to)
	{
		arrEdges[to][from]=1;
		arrEdges[from][to]=1;
	}
	
	public int computeTreeCount() {
		int rCount=0;
		int oddEdgeCount=0;
		int tries=0;
		while(oddEdgeCount!=n || tries>n)
		{
			int removeCount=0;
			oddEdgeCount=0;
	        for (int i=0; i<n; i++) 
	        {
	        	int edgeCount=0;
	        	int currj=-1;
	        	for (int j = 0; j < n; j++) {
	        		if(arrEdges[i][j]>0)
	        		{
	        			edgeCount++;
	        			if(currj<0) currj=j;
	        			
	        		}
	        		
				}
	        	
	        	if(edgeCount%2==0&&edgeCount!=0) 
	        	{
	        		
	
	            	if(currj>=0)
	            		{arrEdges[i][currj]=0;
	            		arrEdges[currj][i]=0;
	            		removeCount++;
	            		
	            		}
	        		
	        	}
	        	else
	        		oddEdgeCount++;
	        		
	            
	        }
	        tries++;
	        rCount+=removeCount;
		}
        return rCount;
    }
	
	public void printGraph()
	{
		
		
		System.out.println();
		for (int i = 0; i < arrEdges.length; i++) {
			for (int j = 0; j < arrEdges[0].length; j++) {
				System.out.print(arrEdges[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}