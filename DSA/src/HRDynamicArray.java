import java.util.Arrays;
import java.util.Scanner;

public class HRDynamicArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int q = scanner.nextInt();
		int lastAns=0;
		
		int seq[][]=new int[n][n];
		for (int[] row : seq)
		    Arrays.fill(row, 0);
		StringBuilder res = new StringBuilder();
		for(int i=0;i<q;i++)
		{
			int qType=scanner.nextInt();
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			
			int z = (x^lastAns)%n;
			int z2=0;
			for (int j = 0; j < n; j++) {
				if (seq[z][j]==0)
				{
					z2=j;
					break;
				}
			}
			
			switch (qType)
			{
			case 1:
				seq[z][z2]=y;
				break;
			case 2:
				int size=0;
				for (int j = 0; j < n; j++) {
					if (seq[z][j]==0)
					{
						size=j;
						break;
					}
					if(j==n-1)
						size=n;
				}
				lastAns=seq[z][(size>0)?y%size:0];
				res.append(lastAns + "\n");
			}
		}
		
		System.out.println(res);
	}
}