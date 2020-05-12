package New;

import java.util.Currency;

public class Stack {
	public static void main(String[] args) {
		MyStack<Integer> stk= new MyStack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk.pop());
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
