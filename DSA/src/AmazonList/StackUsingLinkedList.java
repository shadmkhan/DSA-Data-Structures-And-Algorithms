package AmazonList;

public class StackUsingLinkedList {
	public static void main(String[] args) {
		LLStack stk = new LLStack();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
	}

}

class LLNode{
	int data;
	LLNode next;
	public LLNode(int data,LLNode next)
	{
		this.data=data;
		this.next=next;
	}
}
 class LLStack
 {
	 LLNode head;
	 void push(int n)
	 {
		 LLNode newNode=new LLNode(n, null);
		 if(head==null)
		 {
			 head=newNode;
			 return;
		 }
		 else
		 {
			 newNode.next=head;
			 head=newNode;
		 }
			 
	 }
	 int pop()
	 {
		 if(head==null) return -1;
		 int data= head.data;		 
	 
		 if(head.next==null)
			 head=null;
		 else
			 head=head.next;
		 
		 return data;
	
	 }
	 int peek()
	 {
		if(head==null) return -1;
		return head.data;
			
	 }
 }