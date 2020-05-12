package AmazonProbs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.binarysearchtree.*;

public class LevelWithMostElements {

	public static void main(String args[])
	{

		LocalBST bst = new LocalBST();
		bst.addNodes(new int[]{50,40,35,30,70,60,10,45,42,48,65,62,43,32});
		bst.levelOrder();
		//bst.traverseTree();
		System.out.println();
		System.out.println(bst.levelWithMaxNodes());
		//bst.roofView();
		//bst.distance(4,10);
	}	
}

class LocalBST extends BinarySearchTree
{
	private class QNode{
		Node node;
		int level;
		QNode(Node n, int level)
		{
			this.node=n;
			this.level=level;
			
		}
	}
	
		
	public  int levelWithMaxNodes()
	{

		Queue<QNode> qu= new LinkedList<QNode>();
		
		qu.add(new QNode(root,0));
		
		HashMap<Integer, Integer> hm = new HashMap();
		while(!qu.isEmpty())
		{
			
			QNode qNode = qu.remove();
			
			if(!hm.containsKey(qNode.level))
			{
				hm.put(qNode.level, 1);
			}
			else
			{
				hm.put(qNode.level,hm.get(qNode.level)+1);
			}
			
			if (qNode.node.left!=null)
				qu.add(new QNode(qNode.node.left,qNode.level+1));
			if (qNode.node.right!=null)
				qu.add(new QNode(qNode.node.right,qNode.level+1));
				
			
		}
		
		int maxLevel=0;
		int maxNodes=0;
		for(Map.Entry<Integer, Integer> mp:hm.entrySet())
		{
			if(maxNodes<mp.getValue())
			{
				maxLevel= mp.getKey();
				maxNodes=mp.getValue();
			}
		}
		
		
		return maxLevel;
		
	}
}
