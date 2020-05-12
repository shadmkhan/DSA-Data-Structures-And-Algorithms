package AmazonProbs;

import java.util.Arrays;

public class LIS {
	public static void main(String[] args) {
		int arr[]=new int[]{0,3,2,5,7,6,1,12};
		int lis[]= new int[arr.length];
		Arrays.fill(lis, 1);
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[j]<arr[i])
				{
					lis[i]=Math.max(lis[i], 1+lis[j]);
					max=Math.max(lis[i],max);
				}
			}
		}
		System.out.println(max);
		
	}

}
