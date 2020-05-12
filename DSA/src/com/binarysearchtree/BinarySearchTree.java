package com.binarysearchtree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;



public class BinarySearchTree
{
	public Node root;

	public void addNodes(int[] arrData)
	{
		for(int val:arrData)
		{
			addNode(val);
		}

	}

	public void addNode(int data)
	{
		Node newNode = new Node();
		newNode.data=data;

		if(root==null)
		{	
			root=newNode;
			return;
		}
		Node ptr=root;
		while(ptr!=null)
		{
			Node curr=ptr;

			if(ptr.data>data)
			{
				ptr=ptr.left;
				if(ptr==null)
				{
					curr.left=newNode;
					return;
				}
			}
			else
			{
				ptr=ptr.right;
				if(ptr==null)
				{
					curr.right=newNode;
					return;
				}
			}

		}


	}


	//Compare the trees
	public boolean compareTree(BinarySearchTree bst)
	{
		return compareTree(this.root,bst.root);

	}
	private boolean compareTree(Node root1, Node root2)
	{
		if(root1==null && root2==null) return true;

		if(root1==null || root2==null) return false;

		return (root1.data==root2.data) 
				&&compareTree(root1.left,root2.left)
				&&compareTree(root1.right,root2.right);


	}

	private void traverseTreeHelper(Node n, String r)
	{
		if(n==null) return;
		traverseTreeHelper(n.left, "Left of " + n.data);
		System.out.println(n.data+": "+r);
		traverseTreeHelper(n.right,"Right of "+ n.data);

	}
	public void traverseTree()
	{
		traverseTreeHelper(root,"Root");
	}

	public void levelOrder()
	{
		Queue<QueueNode> q = new LinkedList<QueueNode>();
		q.add(new QueueNode(root,0));
		HashMap<Integer, Node> hm = new HashMap();

		while(!q.isEmpty())
		{
			QueueNode currQNode = q.remove();
			if(!hm.containsKey(currQNode.height))
			{
				hm.put(currQNode.height, currQNode.node);
				System.out.println();
			}
			System.out.print(currQNode.node.data + " ");
			if(currQNode.node.left!=null)
				q.add(new QueueNode(currQNode.node.left,currQNode.height+1));
			if(currQNode.node.right!=null)
				q.add(new QueueNode(currQNode.node.right,currQNode.height +1));
		}

	}

	public void roofView()
	{
		Queue<QueueNode> q = new LinkedList();
		q.add(new QueueNode(root,0));
		HashMap<Integer,Node> hm = new HashMap<>();
		while(!q.isEmpty())
		{
			QueueNode curr = q.remove();

			if(!hm.containsKey(curr.height))
			{
				hm.put(curr.height,curr.node);
				System.out.println(curr.node.data);
			}

			if(curr.node.left!=null)
				q.add(new QueueNode(curr.node.left,curr.height-1));
			if(curr.node.right!=null)
				q.add(new QueueNode(curr.node.right,curr.height+1));

		}
	}


	public int distance(int data1, int data2)
	{
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		searchAndStorePath(root, data1, arr1);
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		searchAndStorePath(root, data2, arr2);
		int dist = 0;
		int lca=1;
		if(arr1!=null && arr2!=null)
		{
			for (int i = 0; i < arr1.size()&&i<arr2.size(); i++) 
			{
				if(arr1.get(i)==arr2.get(i))
					lca+=i;						
			}

			dist=(arr1.size()-lca)+(arr2.size()-lca);
			printLeftDFS(searchAndStorePath(root, arr1.get(arr1.size()-lca), new ArrayList<Integer>()));
			printRightBFS(searchAndStorePath(root, arr1.get(arr1.size()-lca), new ArrayList<Integer>()).right);

		}

		return dist;
	}

	public void printLeftDFS(Node n)
	{
		if(n==null) return;
		printLeftDFS(n.left);
		System.out.println(n.data);
	}
	public void printRightBFS(Node n)
	{
		if(n==null) return;
		System.out.println(n.data);
		printRightBFS(n.right);
	}
	private Node searchAndStorePath(Node n, int data, ArrayList<Integer> arr)
	{
		Node curr=n;
		while(curr!=null)
		{
			if(data==curr.data)
			{
				arr.add(curr.data);
				return curr;
			}
			if(data<curr.data)
			{
				arr.add(curr.data);
				curr=curr.left;
			}
			else
			{
				arr.add(curr.data);
				curr=curr.right;
			}

		}
		arr=null;
		return null;
	}


	private class QueueNode
	{
		Node node;
		int height;
		QueueNode(Node curr, int height)
		{
			this.node=curr;
			this.height=height;
		}
	}

	//Total number of Nodes in the tree
	public int getSize()
	{

		return getSize(root);
	}


	private int getSize(Node n)
	{
		if(n==null) return 0;

		return getSize(n.left) + getSize(n.right)+1;
	}

	// Get height with DFS
	public int getHeight()
	{
		return getHeight(root);
	}

	private int getHeight(Node n)
	{
		if(n==null) return 0;

		return(Math.max(getHeight(n.left), getHeight(n.right)) +1);
	}


	public void printSpiralOrder()
	{
		if(root==null) return;
		LinkedList<Node> dequeue = new LinkedList<>();
		dequeue.addFirst(null);
		Node ptr=root;
		dequeue.addLast(ptr);
		boolean ltr= false;
		while(dequeue.size()!=1)
		{	

			if(ltr)
			{

				ptr=dequeue.removeFirst();
				System.out.print(ptr.data+" ");
				if(dequeue.peekFirst()==null) 
				{
					System.out.println();
					ltr=!ltr;
				}
				if(ptr.left!=null)
					dequeue.addLast(ptr.left);
				if(ptr.right!=null)
					dequeue.addLast(ptr.right);
			}
			else
			{
				ptr=dequeue.removeLast();
				System.out.print(ptr.data+" ");

				if(dequeue.peekLast()==null)

				{
					System.out.println();
					ltr=!ltr;
				}

				if(ptr.right!=null)
					dequeue.addFirst(ptr.right);
				if(ptr.left!=null)
					dequeue.addFirst(ptr.left);
			}

		}

	}

	public void printPreOrder()
	{
		printPreOrder(root);
	}
	
	private void printPreOrder(Node root)
	{
		if(root==null) return;
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

}