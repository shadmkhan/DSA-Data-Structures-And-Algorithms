package AmazonProbs;

import java.util.Arrays;
import java.util.Scanner;

class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		//while(t>0)
		//{
			int n = scanner.nextInt();
			int arr[]= new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=scanner.nextInt();
			}
			res.append(findLIS(arr)+"\n");
			//t--;
		//} 
		scanner.close();
		System.out.println(res);

	}

//	public static void main(String[] args) {
//		
//		System.out.println(findLIS(new int []{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15}));
//	}
	
	
	
	static int findLIS(int arr[])
	{
		int lis[] = new int[arr.length];
		Arrays.fill(lis, 1);
		int n=arr.length;
		
		for(int right=1; right<n;right++)
		{
			for (int left = 0; left < right; left++) 
			{
				if (arr[left]<arr[right])
				{
					lis[right]=Math.max(lis[left]+1, lis[right]);
				}
				
			}
			
		}
		int max = lis[0];
		for (int i = 0; i < lis.length; i++) {
			max=Math.max(lis[i],max);
		}
		return max;
	}


	

}
