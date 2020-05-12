package AmazonList;

import com.binarysearchtree.*;

public class BinaryTreeSumOfAllGreaterValues {
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt.addNodes(new int[]{2,1,4,5});

		bt.traverseTree();
		System.out.println();

		process(bt.root);
		bt.traverseTree();
	}
	static int sum=0;
	static void process(Node root)
	{	
		if(root==null) return;
		process(root.right);
		
		sum+=root.data;
		root.data=sum;
		//System.out.println(root.data);
		process(root.left);
		
	}
}
