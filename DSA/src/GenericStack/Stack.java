package GenericStack;

import java.util.ArrayList;

public class Stack<T extends Comparable> {

	int size;
	int top=-1;
	ArrayList<T> arrStack;
	
	public Stack(int size)
	{
		this.size=size;
		arrStack=new ArrayList<T>(size);
	}
	
	public void push(T element)
	{
		top++;
		arrStack.add(element);
	}
	
	public T pop()
	{
		if(top>=0)
		{
			T temp = arrStack.get(top);
			arrStack.remove(top);
			top--;
			return temp;
			
		}
		return null;
			
	}
	public T peek()
	{
		if(top>=0)
		{		
			return arrStack.get(top);
			
		}
		return null;
			
	}
}
