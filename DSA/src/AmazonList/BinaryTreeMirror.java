package AmazonList;

import com.binarytree.*;
public class BinaryTreeMirror {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(20);
		bt.addNode(22);
		bt.addNode(8);
		bt.addNode(25);
		bt.addNode(26);
		bt.addNode(27);
		bt.addNode(27);
		bt.printInorder();
		System.out.println();
		makeMirror(bt.root);
		bt.printInorder();
		
		BinaryTree bt2 = new BinaryTree();
		bt2.addNode(20);
		bt2.addNode(8);
		bt2.addNode(22);
		bt2.addNode(27);
		bt2.addNode(27);
		bt2.addNode(26);
		bt2.addNode(25);
		//bt2.printInorder();
		
		System.out.println(isMirror(bt.root, bt2.root ));
	}

	
	//Check if binary trees are mirrors
	static boolean isMirror(Node n1, Node n2)
	{
		if(n1==null&&n2==null)
			return true;
		if(n1==null||n2==null)
			return false;		
		return n1.data==n2.data && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
		
	}
	
	static void makeMirror(Node root)
	{
		if(root==null) return;
		
		makeMirror(root.left);
		makeMirror(root.right);
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
}


