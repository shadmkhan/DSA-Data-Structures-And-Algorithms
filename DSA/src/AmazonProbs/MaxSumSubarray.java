package AmazonProbs;


import java.util.Scanner;

	public class MaxSumSubarray {
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int t = scanner.nextInt();
			StringBuilder res = new StringBuilder();

			while(t>0)
			{
				int n = scanner.nextInt();
				int arr[]=new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scanner.nextInt();
				}
				
				res.append(getMaxSum(arr)+"\n");
				t--;
			} 
			scanner.close();
			System.out.println(res);

		}
	
	
	
	
	
	static int getMaxSum(int arr[])
	{
		int sum;
		int maxSum=sum=arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum=Math.max(sum+arr[i], arr[i]);
			System.out.println(sum + " " +arr[i]);
			maxSum=Math.max(sum, maxSum);
		}
		
		return maxSum;
	}
}
