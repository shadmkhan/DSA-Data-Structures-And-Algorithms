package AmazonList;

import java.util.Arrays;

public class LargestSubarraySum {
	
	public static void main(String[] args) {
		int prod=1;
		int arr[] =new int[]{6, -3, -10, 0, 2};
		int maxSum=arr[0];
				
		for (int i = 0; i < arr.length; i++) {
			prod=Math.max(arr[i], prod*((arr[i]==0)?1:arr[i]));
			System.out.println(prod+ " " + maxSum);
			maxSum=Math.max(prod, maxSum);

		}
		System.out.println(maxSum);
	}
	
	

}
