//Total Decoding Messages/Acode
//Problem Statement: http://www.practice.geeksforgeeks.org/problem-page.php?pid=1234
/* A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:
*
* 'A' -> 1
* 'B' -> 2
*...
* 'Z' -> 26
* You are an FBI agent. You have to determine the total number of ways that message can be decoded
* Given encoded message "123",  it could be decoded as "ABC" (1 2 3) or "LC" (12 3) or "AW"(1 23).
* So total ways are 3.
/
/*
* Author:Shad M Khan
*/

import java.util.Scanner;

public class ACode {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			int len = scanner.nextInt();
			String s  = scanner.next();
			int arr[]=new int[len];
			for (int i = 0; i < len; i++) {
				arr[i]=s.charAt(i)-'0';
			}
			
			res.append(countChars(arr, len) + "\n");
			
			t--;
		} 
		scanner.close();
		System.out.println(res);

	}
	
	static int countChars(int[] arr, int n)
	{
		if(arr[0]==0) return 0;
		 if (n == 0 || n == 1) return 1;
		 
		 
		int count=0;
		if (arr[n-1]>0)
			count= countChars(arr,n-1);
			
		if(arr[n-2]>0 && arr[n-2]<2 ||(arr[n-2]==2 && arr[n-1]<=6))
			count+=countChars(arr,n-2);
		
		
		return count;
	}
}
