package Graphs;

import java.util.HashMap;
import java.util.Map;

//This uses Adjacency matrix
public class SimpleGraph {
	public static void main(String[] args) {

		Graph g= new Graph(11);
		g.addEdgeBothSides(2,1);
		
		g.addEdgeBothSides(3,1);
		g.addEdgeBothSides(4,3);
		g.addEdgeBothSides(5,2);
		g.addEdgeBothSides(6,1);
		g.addEdgeBothSides(7,2);
		g.addEdgeBothSides(8,6);
		g.addEdgeBothSides(9,8);
		g.addEdgeBothSides(10,8);
		
		g.printGraph();
	}

}

class Graph
{
	int size;
	int arrEdges[][];
	
	public Graph(){};
	public Graph(int vertices)
	{		
		this.size=vertices;
		arrEdges=new int[size][size];
	}
	
	public void addEdge(int from, int to,int weight)
	{
		arrEdges[to][from]=weight;
	}
	public void addEdge(int from, int to)
	{
		arrEdges[to][from]=1;
	}
	public void addEdgeBothSides( int from,int to,int weight)
	{
		arrEdges[to][from]=weight;
		arrEdges[from][to]=weight;
	}
	public void addEdgeBothSides(int from,int to)
	{
		arrEdges[to][from]=1;
		arrEdges[from][to]=1;
	}
	
	public void addEdges(HashMap<Integer, Integer> edges)
	{
		for(Map.Entry<Integer, Integer> p: edges.entrySet())
		{
			arrEdges[p.getKey()][p.getValue()]=1;
		}
		
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
