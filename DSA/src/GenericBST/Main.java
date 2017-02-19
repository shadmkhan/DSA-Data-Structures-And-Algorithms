package GenericBST;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		bst.addNodes(new Integer[]{50,40,35,30,70,60,10,45,42,48,65,77,68,62,43});
		
		
		bst.printTree();
		System.out.println("Height : " + bst.getHeight());
		
		System.out.println(bst.getParent(25));
		
		//bst.deleteNode(40);
		//System.out.println("");
		//bst.PrintTree();
	}

}
