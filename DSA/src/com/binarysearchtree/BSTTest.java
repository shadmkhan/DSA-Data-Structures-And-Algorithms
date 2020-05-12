
package com.binarysearchtree;


public class BSTTest {
	public static void main(String args[])
	{

		BinarySearchTree bst = new BinarySearchTree();
		bst.addNodes(new int[]{50,40,35,30,70,60,10,45,42,48,65,77,68,62,43,80});

		bst.printPreOrder();
		
		//bst.traverseTree();
		//bst.levelOrder();
		//bst.roofView();
		//bst.distance(43,10);
		
		//System.out.println(bst.compareTree(bst2));
		//System.out.println(bst.getSize());
		//System.out.println(bst.getHeight());
		//bst.printSpiralOrder();
		
	}
}



