package Graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public class GraphAdjMatrix {


	public static void main(String[] args) {

		GraphMatrix g = new GraphMatrix(6);
		g.addVertices(new char[]{'A','B','C','D','E'});

		
		g.addEdge('A', 'C', 2);
		g.addEdge('A','D', 7);
		g.addEdge('A', 'B', 1);
		g.addEdge('C', 'E', 4);
		g.addEdge('D', 'E', 1);
		g.addEdge('B', 'D', 4);
		g.addEdge('C', 'D', 2);

		g.printGraph();
		
		for(Character c : g.findAdjacentNodes('E'))
		{
			System.out.print(c + " ");
		}
		
		g.printShortestPathNew('B');
		//g.printShortestPath('B','D');
		
	}


}

class GraphMatrix
{
	private int arrEdges[][];
	private int currIndex=0;
	private Map<Integer,Character>hsVertices;
	public GraphMatrix(int size) {	
		arrEdges=new int[size-1][size-1];
		hsVertices = new HashMap<>(size);
	}

	public void addVertex(char v)
	{
		hsVertices.put(currIndex,v);
		currIndex++;
	}
	
	public void addVertices(char[] v)
	{
		for(char c:v)
		{
			addVertex(c);
		}
	}

	public void addEdge(char to, char from, int weight)
	{
		
		arrEdges[getKey(to)][getKey(from)]=weight;
	}

	public void printGraph()
	{
		System.out.print(". ");
		for (int i = 0; i < arrEdges.length; i++) {
			System.out.print(hsVertices.get(i)+ " ");
		}
		
		System.out.println();
		for (int i = 0; i < arrEdges.length; i++) {
			System.out.print(hsVertices.get(i) + " ");
			for (int j = 0; j < arrEdges[0].length; j++) {
				System.out.print(arrEdges[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public void printShortestPath(char from, char to)
	{
		ShortestPath spth = new ShortestPath(arrEdges.length);
		int dist[] =spth.dijkstra(arrEdges, getKey(from));
		
		System.out.println("Shortest paths:");
		for (int i = 0; i < dist.length; i++) {
			if(i==getKey(to))
			System.out.println(from + " -> "+ to + " = " + dist[i]);
		}
	}
	public void printShortestPath(char c)
	{
		ShortestPath spth = new ShortestPath(arrEdges.length);
		int dist[] =spth.dijkstra(arrEdges, getKey(c));
		
		System.out.println("Shortest paths:");
		for (int i = 0; i < dist.length; i++) {
			System.out.println(c + " -> " +hsVertices.get(i) + " = " + dist[i]);
		}
	}
	
	public void printShortestPathNew(char c)
	{
		ArrayList<Integer> arrDistance = getShortestPath(c);
		
		for (int i = 0; i < arrDistance.size(); i++) {
			System.out.println(c +" -> " + hsVertices.get(i) + " " + arrDistance.get(i));
		}
	
	}
	
	private ArrayList<Integer> getShortestPath(char c)
	{
		int size = arrEdges.length;
		int source=getKey(c);
		ArrayList<Integer> arrV= new ArrayList<>(arrEdges.length);
		boolean isProcessed[] = new boolean[size];
		for (int i = 0; i < size; i++) {
			arrV.add(Integer.MAX_VALUE);
			isProcessed[i]=false;
		}
		arrV.set(source,0);
		
		for (int i = 0; i < size; i++) {
			
			
			int u = minimumUnprocessedFromArrayList(arrV, isProcessed);
			isProcessed[u]=true;
			for (int v = 0; v < size; v++) {
				if(arrEdges[u][v]>0 && isProcessed[v]!=true && arrV.get(v)>(arrV.get(u)+arrEdges[u][v]))
				{
					arrV.set(v, arrV.get(u)+arrEdges[u][v]);
				}
			}
			
		}		
				
		
		return arrV;
	}
	
	private int minimumUnprocessedFromArrayList(ArrayList<Integer> arr, boolean isProcessed[])
	{
		int min = Integer.MAX_VALUE;
		int minInd=0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i)<min && isProcessed[i]!=true) 
				{
					min=arr.get(i);
					minInd=i;
				}
		}
		return minInd;
	}
	
	private int getKey (char c)
	{
		for(Map.Entry<Integer, Character> p: hsVertices.entrySet())
		{
			if(p.getValue()==c)
			{
				return p.getKey();
			}
		}
		return -1;
	}

	public Set<Character> findAdjacentNodes(char v)
	{
		Set <Character> s = new HashSet<>();
		
		for(int i=0;i<arrEdges[0].length;i++)
		{
			
			if(arrEdges[getKey(v)][i]>0)
				s.add(hsVertices.get(i));
		}
		return s;
	}

}


class ShortestPath
{
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    int V;
    public ShortestPath(int size) {
    	V=size; 
		// TODO Auto-generated constructor stub
	}
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }
 
    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    int[] dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);
 
            // Mark the picked vertex as processed
            sptSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
        // print the constructed distance array
        return dist;
    }
}
