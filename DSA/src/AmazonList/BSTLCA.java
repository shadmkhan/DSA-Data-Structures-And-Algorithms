package AmazonList;
import com.binarysearchtree.*;


public class BSTLCA {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNodes(new int[]{50,40,35,30,70,60,10,45,42,48,65,77,68,62,43,80});
		
		System.out.println( findLCAinBST(bst.root,62,50).data);
	}
	
	static Node findLCAinBST(Node root,int x, int y)
	{
		//if(root==null) return root;
		if(root.data>Math.max(x, y))
			return findLCAinBST(root.left, x, y);
		else if(root.data<Math.min(x, y))
			return findLCAinBST(root.right, x, y);
		else
			return root;
	}
	

}

