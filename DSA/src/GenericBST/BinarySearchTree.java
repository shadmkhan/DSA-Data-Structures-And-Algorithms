package GenericBST;

public class BinarySearchTree<T extends Comparable> {
	protected Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public void addNodes(T[] arrData)
	{
		for(T val:arrData)
		{
			addNode(val);
		}
		
	}
	public boolean addNode(T data) {
		try {
			Node<T> newNode = new Node<T>();
			newNode.setData(data);
			if (root==null)			
			{
				root=newNode;
				return true;
			}
			Node<T> currNode = root;
			while(true)
			{
				if(newNode.compareTo(currNode)<0)
				{
					//Go left
					if(currNode.getLeft()==null)
					{
						currNode.setLeft(newNode);
						return true;
					}

					currNode=currNode.getLeft();

				}
				//if(newNode.compareTo(currNode)>=0)
				else
				{
					//Go right
					if(currNode.getRight()==null)
					{
						currNode.setRight(newNode);
						return true;
					}

					currNode=currNode.getRight();
				}

			}


		} catch (Exception e) {
			return false;
		}

	}
	
	public int getHeight()
	{
		return getHeight(root);
	}
	
	private int getHeight(Node<T> currNode)
	{
		if (currNode==null) return 0;
		int leftHeight=(getHeight(currNode.getLeft()));
		int rightHeight=(getHeight(currNode.getRight()));
		return (((leftHeight>rightHeight)?leftHeight:rightHeight) + 1);
	}
	
	public void deleteNode(T data)
	{
		deleteNode(root,data);
	}
	
	private Node<T> deleteNode(Node<T> currNode, T data)
	{
		if (currNode==null) return currNode;
		Node<T> delNode=new Node<T>();
		delNode.setData(data);
		
		if(currNode.compareTo(delNode)>0)
		{
			currNode.setLeft(deleteNode(currNode.getLeft(), data));
		}
		else if(currNode.compareTo(delNode)<0)
		{
			currNode.setRight(deleteNode(currNode.getRight(), data));
		}
		else
		{
			if(currNode.getLeft()==null)
				return(currNode.getRight());
			else if(currNode.getRight()==null)
				return(currNode.getLeft());
			currNode.setData(minValue(currNode.getRight()));
			currNode.setRight(deleteNode(currNode.getRight(), currNode.getData()));
			
		}
		return currNode;
	}
	public void printLevelOrder()
	{
		int distance;
		int height = getHeight();
		for (int i = 1; i <= height; i++) {
			System.out.print("Level : " + i + ": ");
			printLevel(root,i);
			System.out.println();
		}
	}
	
	private void printLevel(Node n, int level)
	{
		if (n==null) return;
		if(level==1) System.out.print(n.getData()+" ");
		printLevel(n.getLeft(), level-1);
		printLevel(n.getRight(), level-1);
	}

	private T minValue(Node<T> r)
    {
        T minv = r.getData();
        while (r.getLeft() != null)
        {
            minv = r.getLeft().getData();
            r = r.getLeft();
        }
        return minv;
    }

	public void printTree()
	{
		traverseTree(root, "Root");
	}
	
	public void printTreeInOrder()
	{
		traverseTreeInOrder(root);
	}
	
	public void printTreePreOrder()
	{
		traverseTreePreOrder(root);
	}
	
	public void printTreePostOrder()
	{
		traverseTreePostOrder(root);
	}

	private void traverseTree(Node<T> r, String text)
	{
		if(r==null) return;
		traverseTree(r.getLeft(),"Left of " + r.getData());
		System.out.println( r.getData().toString() + " : " +text);
		traverseTree(r.getRight(),"Right of "+ r.getData());

	}
	private void traverseTreeInOrder(Node<T> r)
	{
		if(r==null) return;
		traverseTreeInOrder(r.getLeft());
		System.out.print( r.getData().toString() + ",");
		traverseTreeInOrder(r.getRight());

	}
	
	private void traverseTreePreOrder(Node<T> r)
	{
		if(r==null) return;
		System.out.print( r.getData().toString()+ ",");
		traverseTreePreOrder(r.getLeft());
		traverseTreePreOrder(r.getRight());
	}
	
	private void traverseTreePostOrder(Node<T> r)
	{
		if(r==null) return;		
		traverseTreePostOrder(r.getLeft());
		traverseTreePostOrder(r.getRight());
		System.out.print( r.getData().toString()+ ",");
	}
	
	
	public T getParent(T data)
	{
		return getParentHelper(root,root,data).getData();
	}
	private Node<T> getParentHelper(Node<T> n,Node<T> parent,T data)
	{
		
		if(n==null||n.getData().compareTo(data)==0)
				return parent;
		 
		if(n.getData().compareTo(data)>0)
		
			return(getParentHelper(n.getLeft(),n,data));
		
		else
			
			return(getParentHelper(n.getRight(),n,data));
	}
}

