package AmazonProbs;

import java.util.ArrayList;

import com.binarysearchtree.*;

class LocalBST2 extends BinarySearchTree{
	
	public int LCA(int a, int b)
	{
		ArrayList<Node> arrA = getPath(a);
		ArrayList<Node> arrB = getPath(b);
		int i =0;
		int x= 0;
		while(i<Math.min(arrA.size(),arrB.size()))
		{
			if(arrA.get(i)==arrB.get(i))
			{
				x = arrA.get(i).data;
				i++;
			}
			else
				break;
		}
		return x;
		
	}
	private ArrayList<Node> getPath(int n)
	{
		ArrayList<Node> arrPath = new ArrayList<>();
		Node ptr = root;
		
		while(ptr!=null)
		{
			arrPath.add(ptr);

			if(ptr.data==n) break;
			
 			if(ptr.data>n)
				ptr=ptr.left;
			else
				ptr=ptr.right;
		}
		
		return arrPath;
	}
}

public class LCABinaryTree {

	public static void main(String[] args) {
		LocalBST2 bst = new LocalBST2();
		bst.addNodes(new int[]{50,40,35,30,70,60,10,45,42,48,65,77,68,62,43});
		//bst.traverseTree();
		System.out.println(bst.LCA(10, 80));
		
	}
}
