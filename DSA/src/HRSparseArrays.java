import java.util.Arrays;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/sparse-arrays
public class HRSparseArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		String arr[]= new String[n];
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			
			arr[i]=scanner.next();
		}
		
		int t= scanner.nextInt();
		for (int i = 0; i < t; i++) {
			String q= scanner.next();
			int count=0;
			for(int j=0;j<n;j++)
			{
				if (arr[j].equals(q))
					count++;
			}
			res.append(count + "\n");
			
		}
		
		System.out.println(res);
	}

}
