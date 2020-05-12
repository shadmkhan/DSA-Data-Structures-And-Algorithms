package com.binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import javax.tools.ToolProvider;


public class BinaryTree
{
	public Node root;
	public void addNode(int n)
	{
		if(root==null) 
		{
			root= new Node(n,null,null,null);
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node nd = q.remove();
			if( nd.left==null)
			{
				nd.left=new Node(n,null,null,nd);
				return;
			}
			else
				q.add(nd.left);
			if( nd.right==null)
			{
				nd.right=new Node(n,null,null,nd);
				return;
			}
			else
				q.add(nd.right);
			
		}
		
	}
	
	//LCA using parent pointer	
	public void findLCA()
	{
		System.out.println(LCA(root.left,root.left.right).data);
	}
	
	//LCA using parent pointer
	Set<Node> s= new HashSet<>();
	private Node LCA(Node n1, Node n2)
	{
		if(n1==null||n2==null) return null;
		while(n1!=null)
		{
			s.add(n1);
			n1=n1.parent;
		}
		
		while(n2!=null)
		{
			if(s.contains(n2)) return n2;
			n2=n2.parent;
			
		}
			
		return null;
	}
	
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node root)
	{
		if(root==null) return;
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
		
	}
	public int height()
	{
		return getHeight(root);
	}
	
	private int getHeight(Node root)
	{
		if(root==null) return 0;
		int lHeight=getHeight(root.left);
		int rHeight=getHeight(root.right);
		return(Math.max(lHeight, rHeight)+1);
		
	}
	
	public void printTopView()
	{
		topView(root, 0);
	}
	
	
	private void topView(Node root, int distance)
	{
		if(root==null) return;
		
		if(distance>0)
		{
			System.out.println(root.data);
			
		}
		topView(root.left,distance-1);
		topView(root.right,distance+1);
	}
	void top_view(Node root)    
	{    
	    if(root.left!=null) top_view(root.left);   

	    if(root.left!=null || root.right!=null)
	         System.out.print(root.data + " ");

	    if(root.right!=null) top_view(root.right);        
	}
}
