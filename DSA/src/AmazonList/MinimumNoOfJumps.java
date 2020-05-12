package AmazonList;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Given an array of integers where each element represents the max number of steps that can 
 * be made forward from that element. Write a function to return the minimum number of jumps 
 * to reach the end of the array (starting from the first element). If an element is 0, then 
 * cannot move through that element.
 */
public class MinimumNoOfJumps {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			int n = scanner.nextInt();
			int arr[]= new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=scanner.nextInt();
			}
			//System.out.println(getMinJumpsBFS(arr));
			System.out.println(getMinJumpsDP(arr));
			t--;
		} 
		
		//System.out.println(minJump(arr, new int[arr.length]));
		//System.out.println(getMinJumpsDP(arr));
		//System.out.println(getMinJumpsBFS(arr));
	}
	
	static int getMinJumpsDP(int arr[])
	{
		int aux[] = new int[arr.length];
		
		Arrays.fill(aux,Integer.MAX_VALUE-1);
		aux[0]=0;
		
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(j+arr[j]>=i)
				{
					if(aux[i]>aux[j]+1)
						aux[i]=aux[j]+1;					
				}				
			}
			
			
		}
		if(aux[arr.length-1]>arr.length) aux[arr.length-1]=-1;
		return(aux[arr.length-1]);		
	}
	
	
	  static public int minJump(int arr[],int result[]){
	        
	        int []jump = new int[arr.length];
	        
	        Arrays.fill(jump,Integer.MAX_VALUE-1);
	        jump[0] = 0;
	        for(int i=1; i < arr.length; i++){
	            for(int j=0; j < i; j++){
	                if(arr[j] + j >= i){
	                    if(jump[i] > jump[j] + 1){
	                        result[i] = j;
	                        jump[i] = jump[j] + 1;
	                    }
	                }
	            }
	        }
	        
	        return jump[jump.length-1];
	    }
	static int getMinJumpsBFS(int arr[])
	{
		Queue<QNode> queue = new LinkedList<>();
		queue.add(new QNode(0,0));
		boolean visited[]= new boolean[arr.length];
		int steps=0;
		while(!queue.isEmpty())
		{
			QNode currNode = queue.remove();
			int currIndex=currNode.index;
			int currSteps=currNode.steps;
			
			int currValue=arr[currIndex];
			
			steps=currSteps;
			if(currIndex==arr.length) break;

			for (int i = 1; i <= currValue; i++) {
				if(currIndex+i<arr.length)
				{
					if(!visited[currIndex+i])
					{
						queue.add(new QNode(currIndex+i,currSteps+1));
						visited[currIndex+i]=true;
					}
					
				}
					
			}
			//System.out.println(queue.size());
			
			
		}
		if(steps==0) steps=-1;
		return steps;
	}
	static class QNode
	{
		int steps;
		int index;
		QNode(int index, int steps)
		{
			this.steps=steps;
			this.index=index;
		}
	}
}


