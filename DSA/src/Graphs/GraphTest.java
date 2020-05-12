package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class WeightedNode
{
	Integer vertex;
	Integer weight;
	
	public WeightedNode(Integer vertex, Integer weight) {
		this.vertex=vertex;
		this.weight=weight;
		
	}
	public WeightedNode(Integer vertex) {
		this.vertex=vertex;
		this.weight=0;
		
	}
}
class GraphAdjList
{
	Map<Integer, LinkedList<WeightedNode>> v = new HashMap<>();
	
	public void addVertices(int[] values)
	{
		for(int v:values)
			addVertex(v);
	}
	public void addVertex(Integer value)
	{
		v.put(value, new LinkedList<WeightedNode>());
	}
	
	public void addEdge(Integer from, Integer to, Integer weight)
	{
		v.get(from).add(new WeightedNode(to,weight));		
		
	}
	public void addEdge(Integer from, Integer to)
	{
		v.get(from).add(new WeightedNode(to));		
		
	}
	
	public int getDegree(Integer vertex)
	{
		
		return v.get(vertex).size();
	}
	
	public void print()
	{
		
		long i = 0;
		for (Map.Entry<Integer, LinkedList<WeightedNode>> pair : v.entrySet()) {
		    System.out.println("Vertex " + pair.getKey());
		    for(WeightedNode c:pair.getValue())
		    	System.out.println("connected to " + c.vertex + "  weight = " + c.weight);
		    
		}

	}
	
}


public class GraphTest
{
	public static void main(String[] args) {
		GraphAdjList g = new GraphAdjList();
		
		g.addVertices(new int[]{1,2,3,4,5,6,7,8,9,10});
		
		g.addEdge(2,1);
		g.addEdge(3,1);
		g.addEdge(4,3);
		g.addEdge(5,2);
		g.addEdge(6,1);
		g.addEdge(7,2);
		g.addEdge(8,6);
		g.addEdge(9,8);
		g.addEdge(10,8);
		
		
		g.print();
		
		int n=5;		
		System.out.println("Degree of Node : "+ n + " = " + g.getDegree(n));
	}
	
}

