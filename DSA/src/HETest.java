import java.util.Scanner;

public class HETest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			int n = scanner.nextInt();
			res.append(countTree(n)+"\n");
			t--;
		} 
		System.out.println(res);

	}
	
	public static int countTree(int n)
	{
		if(n<=1) return 1;
		int sum=0; 	
		for(int i=1;i<=n;i++)
		{
			sum+=countTree(i-1)*countTree(n-i);
		}
		
		return sum;
	}
}