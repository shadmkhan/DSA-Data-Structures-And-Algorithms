package AmazonList;

import java.util.Arrays;

/*
 * Input: 3,4,5,7,6,10
 * Output: 4
 */
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		System.out.println(getLIS(new int[]{3,4,5,0,9,10}));
	}

	static int getLIS(int arr[])
	{
		int lis[]=new int[arr.length];
		int max=0;
		Arrays.fill(lis, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				
				if(arr[i]>arr[j])
				{
					lis[i] =Math.max(lis[i],lis[j]+1);
					max=Math.max(lis[i],max);
					
				}
			}
			
		}
		return max;
		
	}
}
