package AmazonList;

import com.binarytree.*;

public class BinaryTreeLCALinearTime {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(20);
		bt.addNode(22);
		bt.addNode(8);
		bt.addNode(25);
		bt.addNode(26);
		bt.addNode(27);
		bt.addNode(27);
		
		Node x=findLCA(bt.root, bt.root.right,bt.root.right.right);
		if(x!=null) 
			System.out.println(x.data);
		
		System.out.println(bt.height());
	}
	
	static Node findLCA(Node root, Node n1, Node n2)
	{
		if(root==null) return null;
		if(root==n1) return n1;
		if(root==n2) return n2;
		
		Node left=findLCA(root.left,n1,n2);
		Node right=findLCA(root.right,n1,n2);
		
		
		if (left!=null&&right!=null)
			return root;
		if(left==null&&right==null)
			return null;
		
		return(left!=null?left:right);
		
	}
}
