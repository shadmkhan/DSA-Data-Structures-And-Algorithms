package AmazonProbs;

import java.util.Arrays;
import java.util.Scanner;


public class PreserveAndDeleteNodes {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String arr[]= scanner.next().split(",");
		LLNode<Integer> ndStart =null;
			
		for (int i = 0; i < arr.length; i++) {
			LLNode<Integer> ndCurrNode = ndStart;
			int data=Integer.parseInt(arr[i]);
			if(ndStart==null)
			{			
				ndStart=new LLNode<Integer>(data,null);
			}
			else
			{
				while(ndCurrNode.next!=null)
					ndCurrNode=ndCurrNode.next;
				
				ndCurrNode.next= new LLNode<Integer>( Integer.parseInt(arr[i]),null);
			}
					
		}
		int steps= scanner.nextInt();
		int deletions = scanner.nextInt();
		
		LLNode<Integer> ndCurrNode = ndStart;
		LLNode<Integer> ndTemp;
		
		while(ndCurrNode!=null)
		{
			for (int i = 1; i <steps ; i++) {
				ndCurrNode=ndCurrNode.next;
			}
			if(ndCurrNode!=null)
			{
				ndTemp=ndCurrNode.next;
				for (int i = 0; i < deletions; i++) 
				{
					LLNode<Integer> ndDel = ndTemp;
					if(ndTemp!=null)
					ndTemp=ndTemp.next;
					ndDel=null;
					
				}
				ndCurrNode.next=ndTemp;
				
				ndCurrNode=ndCurrNode.next;
			}
			
			
		}
		
		System.out.println(ndStart.toString(ndStart));
		
	
		
	

}
}
class LLNode<T>
{
	
	T data;
	LLNode next;
	public LLNode(T data, LLNode next)
	{
		this.next=next;
		this.data=data;
	}
	public LLNode()
	{
		data=null;
		next=null;
	}
	 public String toString(LLNode<T> ndStart)
	{
		if (ndStart==null)
		{
			return("Empty");
		}
		LLNode nptr= ndStart;
		String ret="";
		
		
		do{
			
			ret=ret+nptr.data.toString() + ",";
			nptr=nptr.next;
		}
		while (nptr!=null);
			
		ret= ret.substring(0,ret.length()-1);
		
		return ret;
				
	}
	
	
}


	
	
