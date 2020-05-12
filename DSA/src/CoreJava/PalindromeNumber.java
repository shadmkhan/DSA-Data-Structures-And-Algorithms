package CoreJava;
import java.io.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int num=n;
		int rev=0;
		int dig=0;
		while(n>0)
		{
			dig=n%10;
			rev=rev*10 + dig;
			n=n/10;
		}
		System.out.println(rev);
	}
}
