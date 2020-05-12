package AmazonList;

import java.util.LinkedList;
import java.util.Queue;

import com.binarytree.BinaryTree;

public class BinaryTreeParentPointerLCA {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(20);
		bt.addNode(22);
		bt.addNode(8);
		bt.addNode(25);
		bt.addNode(26);
		bt.addNode(27);
		bt.addNode(27);
		//bt.printInorder();
		//bt.findLCA();
		bt.printTopView();
	}
}

