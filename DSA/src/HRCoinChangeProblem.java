import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class HRCoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int noOfCoins= scanner.nextInt();
		
		int arrCoins[]= new int[noOfCoins];
		for (int i = 0; i < arrCoins.length; i++) {
			arrCoins[i]=scanner.nextInt();
		}
		scanner.close();
		
		int arrTotal[] = new int[total+1];
		int path[] = new int[total+1];
		Arrays.fill(arrTotal, Integer.MAX_VALUE);
		Arrays.fill(path,-1);
		arrTotal[0]=0;
	
		
		for (int i = 0; i < noOfCoins; i++) 
		{
			for (int j = 1; j < total+1; j++) 
			{
				int temp=arrTotal[j];
				if(j>=arrCoins[i])
					arrTotal[j]=Math.min(arrTotal[j], 1 + ((arrTotal[j-arrCoins[i]]==Integer.MAX_VALUE)?Integer.MAX_VALUE-1:arrTotal[j-arrCoins[i]]));
				if(arrTotal[j]<temp)
					path[j]=i;
			}
		}
		
		for (int i = 0; i < path.length; i++) {
			System.out.print(arrTotal[i]+" | ");
		}
		
		System.out.println();
		for (int i = 0; i < path.length; i++) {
			System.out.print(path[i]+" | ");
			
		}
		int x=path.length-1;
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println();
		while(x>0)
		{
			arr.add(arrCoins[path[x]]);
			x=x-arrCoins[path[x]];
		}
		
		for(Integer i:arr )
		{
			System.out.print(i+" ");
		}
		
	}

}
