import java.util.Scanner;
//https://www.hackerrank.com/challenges/maximum-element


public class HRMaximumElementStack {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		StringBuilder res = new StringBuilder();
		MyStack<Integer> m = new MyStack();
		MyStack<Integer> maxM = new MyStack();
		
		
		int max=0;
		for(int i=0;i<n;i++)
		{
		
			
			int qry= scanner.nextInt();
			int x=0;
			
			switch(qry)
			{
				case 1:
				 x= scanner.nextInt();
				 m.push(x);
				 if(maxM.peek()!=null) 
				 {
					 if(x>=maxM.peek()) maxM.push(x);
				 }
				 else maxM.push(x);
				 break;
				case 2:
					int mP=(m.peek()==null?0:m.peek());
					int maxP=(maxM.peek()==null?0:maxM.peek());
					
					if(mP==maxP) 
							maxM.pop();
					m.pop();

					break;
				case 3:
					if(maxM.peek()!=null) 
					res.append(maxM.peek() + "\n");
					else
						res.append(0 + "\n");
					//
						
				
			}
			
		}
		
		System.out.println(res);
			
	}
	

}
class Node<T>
{
	T data;
	Node<T> next;
	
	Node(T data)
	{
		this.data=data;
	}
}

class MyStack<T>{
	private Node<T> top;
	
	void push(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(top==null)
		{
			top=newNode;
		}
		else
		{
			
			newNode.next=top;
			top=newNode;
		}
		
	}
	T pop()
	{
		if (top==null)
		{
			return null;
		}
		T tmp=top.data;
		top=top.next;
		return(tmp);	
	}
	
	T peek() {
		if (top==null) return null;
        return top.data;
    }
	
	
}
