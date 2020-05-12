package HRDoublyLinkedList;



public class HRDoublyLinkedList {
	public static void main(String[] args) {

		Node n=new Node();
		Node n2=new Node();
		n.data=3;
		n.next=n2;
		n2.data=4;
		n2.prev=n;
		
		
		n=n.SortedInsert(n, 7);
		n=n.SortedInsert(n, 5);
		
		n=n.Reverse(n);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
}

class Node {
    int data;
    Node next;
    Node prev;
    Node SortedInsert(Node head,int data) {
        Node newNode= new Node();
        newNode.data=data;
        if(head==null) return newNode;
        Node ptr=head;
        while(ptr!=null)
        {
            Node prev=ptr.prev;
            Node next=ptr.next;

            int prevdata=(prev==null)?Integer.MIN_VALUE:prev.data;
            int nextdata=(next==null)?Integer.MAX_VALUE:next.data;
            
            
            if(prevdata<data&&ptr.data>=data)
            {
            	ptr.prev=newNode;
            	newNode.next=ptr;
            	
                if(prev==null) return newNode;
                newNode.prev=prev;
                prev.next=newNode;
                return head;
                
            }
            if(ptr.next==null)
            {
            	ptr.next=newNode;
            	newNode.prev=ptr;
            	return head;
            }
            ptr=ptr.next;
            
        }
        
        
        
        return head;
        
   }
    
    
    Node Reverse(Node head) {
        
        if(head==null) return null;
        Node ptr=head;
        if(ptr.next==null&ptr.prev==null) return head;
        while(ptr!=null)
        {
            Node temp=ptr.next;
            ptr.next=ptr.prev;
            ptr.prev=temp;
            head=ptr;
            ptr=ptr.prev;
            
        }
         
        return head;

    }
    
 }


