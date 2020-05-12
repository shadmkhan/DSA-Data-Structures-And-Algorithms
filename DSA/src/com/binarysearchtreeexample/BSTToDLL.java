package com.binarysearchtreeexample;



class DLLNode
{
	int data;
	DLLNode prev;
	DLLNode next;
}

public class BSTToDLL  {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> b = new BinarySearchTree();
		b.addNodes(new Integer[]{10,8,12,7,9,11});
		
		DLLNode head = new DLLNode();
		DLLNode head1 = head;
		
		head=traverseTree( b.root,head1);
		
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
		
	}
	
	static public DLLNode traverseTree(Node n,DLLNode dn)
	{
		if(n==null) return null;
		
		
		dn.prev=traverseTree(n.getLeft(),new DLLNode());
		dn.data=(int) n.getData();

		dn.next=traverseTree(n.getRight(),new DLLNode());
	
		return dn;
	}
}
