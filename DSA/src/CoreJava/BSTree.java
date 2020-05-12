package CoreJava;

//A BNode represents an individual node in a binary tree
class BNode
{
  int data=0;
  BNode left=null;
  BNode right=null;
}


//A BinarySearchTree is a collection of nodes linked to each other in tree fashion
@SuppressWarnings({"unchecked","deprecation"})
class BinarySearchTree
{
  BNode root =null;
  int elements=0;
  
  
  public void add(int data)
  {
    BNode newNode= new BNode();
    newNode.data=data;
    //If root is null, we add the new node as root
    if (root==null)
    {
      root=newNode;
      
      return;
    }
    else
    {
      //We will now traverse the entire tree checking for an appropriate place for the new node
      BNode ptr = new BNode();
      ptr=root;
      while(ptr!=null)
      {
        
        if (ptr.data>data)
        {
          if (ptr.left==null)
          {
            ptr.left=newNode;
            ptr=ptr.left;

          }
        
        ptr=ptr.left;
        
            
        }
        else
        {
          if (ptr.right==null)
          {
            ptr.right=newNode;
            ptr=ptr.right;

          }
        ptr=ptr.right;
        
            
        }
        
      }
    }
  }
  
  public void delete(int data)
  {
	  delete(data,root);
  }
  
  BNode FocusNode ;
  BNode PofFocusNode;
  boolean isLeftChild;
  boolean isRightChild;  
  
  void delete(int data, BNode n)
  {
      //If node is pointing to null, return
	  if(n==null) return;

	  if (data==root.data)
	  {
	      //If node to delete is the root node, set ParentofFocusNode to null
		  FocusNode=n;
		  PofFocusNode=null;
	  }
	  
      //If node to delete is the root node, set ParentofFocusNode to null
	  if(n.left!=null)
	  {		  
		  if (data == n.left.data)
		  {
			  FocusNode=n.left;
			  PofFocusNode=n;
			  isLeftChild=true;			  
		  }  
	  }
	  if(n.right!=null)
	  {
		  if(data==n.right.data)
		  {
			  FocusNode=n.right;
			  PofFocusNode=n;
			  isRightChild=true;
			  
		  }  
	  }
	  
	  if (FocusNode!=null)
	  {
		  if (FocusNode.left==null && FocusNode.right==null)
			  
		  {
			  if (isLeftChild)
				  PofFocusNode.left=null;
			  else
				  PofFocusNode.right=null;  
		  }
		  else if (FocusNode.left==null && FocusNode.right!=null)
		  {
			  PofFocusNode.left=FocusNode.right;
		  }
		  else if (FocusNode.left!=null && FocusNode.right==null)
		  {
			  PofFocusNode.left=FocusNode.left;
		  }
		  else if(FocusNode.left!=null && FocusNode.right!=null)
		  {
			  if(FocusNode.data==root.data)
				  root=FocusNode;
			  FocusNode.data=delmin(FocusNode.right);
			  if(FocusNode.right.right==null)
				  FocusNode.right=null;
			  
			
							  
		  }
		  return;
		    
	  }
	  
			
	  if(n.data>data)
		  delete(data,n.left);
	  else if (n.data<data)
		  delete(data,n.right);
  }
  
  public void traverseTree()
  {	  
	  traverse(root,"Root");
  }
  public void traverse(BNode n,String s)
  { 
		if (n==null)return;
	    
		//Preorder traversal (1) Visit the root, (2) Traverse the left subtree, and (3) Traverse the right subtree.
		//Postorder traversal(1)Traverse the right subtree, (2) Traverse the left subtree, and (3) Visit the root. 
		//This is In-order traversal 
		
	    traverse(n.left,"Left of " + n.data );
	    System.out.println(n.data + " " + s);
	    traverse(n.right,"Right of " + n.data );
    
    }
  
  public void printHeight()
  {
	  System.out.println("\n" + height(root));
  }
  int height(BNode n){
	    if(n==null)
	        return 0;
	  
	    if(n.left==null && n.right==null)
	        return 1;
	  
	    int lheight = height(n.left);
	    int rheight = height(n.right);
	  
	    return Math.max(lheight, rheight) + 1;
	}
  
  //Level order traversal 
  public void printTreeLevelOrder(){
	    
	    int h = height(root);
	    
	    for(int i=1; i<=h; i++){
	    	
	    	System.out.println("Level: "+ i);
	        printTreeLevelRec(root, i);
	        
	    }
	    
	    
	}
  
  
  
	  
	void printTreeLevelRec(BNode  node, int desired){
	    if(node==null)
	        return;
	    if (desired == 1)
	    	System.out.println(node.data);
	  
	    printTreeLevelRec(node.left, desired-1);
	    printTreeLevelRec(node.right, desired-1);
	}
  
  
  

  public void minimum()
  {

	  System.out.println(min(root).data);
	  
  }
  
  /*Return minimum value starting from the Node passed.
   * No need to search the entire tree, just return the extreme left node.
   */
 
  BNode min(BNode n)
  
  {
	  if(n==null)	return(n);

	  while(n.left!=null)
	  {
		  n=n.left;
	  }
	  	  
	  return(n);
	  
	  
  }
  //Returns the minimum node's value + deletes it
 int delmin(BNode n)
  
  {
	  if(n==null)	return -1;
	  if(n.left==null) return n.data;
	  if(n.left.left==null) 
	  {
		  int minimum=n.left.data;
		
		  n.left=null;
		  return minimum; 
	  }
	  
	  while(n.left.left!=null)
	  {
		  n=n.left;
	  }
	  int minimum=n.left.data;
	  n.left=null;
	  return minimum;
	  
  }
 
 //Print all leaf nodes
 public void allLeafs(BNode n)
 {
	 if (n==null) return;
	 if (n.left==null&&n.right==null){	
		 System.out.print(n.data+", ");

	 }
	 else
	 {
		 allLeafs(n.left);
		 allLeafs(n.right);
	 }
	 
	 
	 
	 
	 
	 
 }
 
 public void getAllLeaves()
 {
	 allLeafs(root);	 
 }
}

public class BSTree
{
  public static void main(String[] args)
  {
    BinarySearchTree bn = new BinarySearchTree();
    bn.add(20);
    bn.add(10);
    bn.add(30);
    //bn.add(12);
    bn.add(25);
    bn.add(35);
    bn.add(5);
    bn.add(2);
    bn.add(33);
    bn.add(7);
    bn.add(45);
    bn.add(43);
    bn.add(42);
    bn.add(41);
    bn.add(50);
        
    //bn.delete(20);
    
    
    //System.out.println(bn.root.data);
    //System.out.println(bn.root.left.data);
    //System.out.println(bn.root.right.data);
  	//System.out.println(bn.root.left.right.data);
  	bn.traverseTree();
  	//bn.getAllLeaves();
  	
  	
 // 	bn.printHeight();
  	//bn.printTreeLevelOrder();
  }
}