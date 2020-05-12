package com.binarytree;

public class Node
{
	public Node left;
	public Node right;
	Node parent;
	public int data;
	
	Node(int data, Node left, Node right, Node parent)
	{
		this.data=data;
		this.left=left;
		this.right=right;
		this.parent=parent;
		
	}
}
