package IntervalSearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class IntervalSearchTree {
	
	private Node root;
	
	public void insertData(int low, int high)
	{
		Node newNode=new Node(low,high);
		
		
		if(root==null)
		{
			root=newNode;
			return;
		}
		Node ptr=root;
		while(true)
		{
			Node parent=ptr;
			ptr.maxValue=Math.max(ptr.maxValue,high);
			if(low<ptr.low)
			{
				ptr=ptr.left;
				if(ptr==null)
				{

					parent.left=newNode;
					
					break;
				}
				
			}
			else
			{
				ptr=ptr.right;
				if(ptr==null)
				{
					
					parent.right=newNode;
					break;
				}
			}
			
		}	
		
		
	}
	
	public void printInorder()
	{
		printInorderHelper(root," Root ");
	}
	
	public void printMaxInorder()
	{
		printMaxInorderHelper(root, " Root ");
	}

	public void printLevelorder()
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node n=q.remove();
			
			if(n.left!=null)
				q.add(n.left);
			if(n.right!=null)
				q.add(n.right);
			System.out.println(n.low + " , " + n.high);
			
		}
	}
	
	
	private void printInorderHelper(Node n, String val)
	{
		if(n==null) return;
		printInorderHelper(n.left," Left of "+n.low + " , " + n.high);
		System.out.println(n.low + " , " + n.high+val);
		printInorderHelper(n.right," Right of "+n.low + " , " + n.high);
	}
	
	private void printMaxInorderHelper(Node n, String val)
	{
		if(n==null) return;
		printMaxInorderHelper(n.left," Left of "+n.maxValue);
		System.out.println(n.maxValue + val);
		printMaxInorderHelper(n.right," Right of "+n.maxValue );
	}
	
}
