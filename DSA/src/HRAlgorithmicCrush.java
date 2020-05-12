import java.util.Arrays;
import java.util.Scanner;

public class HRAlgorithmicCrush {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long arr[]=new long[n];
		long max=0;
		while(m>0)
		{
			int a =scanner.nextInt();
			int b=scanner.nextInt();
			long c =scanner.nextLong();
			
			for(int i = a-1; i<b;i++)
			{
				arr[i]+=c;
				if (arr[i]>max) max=arr[i];

			}
			m--;	
		}
		
		
		

		System.out.println(max);
		

	}

}
