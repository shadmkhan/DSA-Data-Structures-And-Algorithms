package IntervalSearchTree;

public class Node {
	int low;
	int high;
	
	int maxValue;
	
	Node left;
	Node right;
	
	public Node(int low, int high)
	{
		this.low=low;
		this.high=high;
		this.maxValue=high;
		
	}
}
