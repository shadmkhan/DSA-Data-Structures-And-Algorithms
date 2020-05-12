package CoreJava;
import java.io.*;
public class Armstrong
{
	public static void main(String args[])
	{
		
		int n = 0;
		while (n!=-1)
		{
			System.out.print("Please Enter a Number: ");
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				n = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			int num=n;
			int product=0;
			while(num!=0)
			{
				product=product +(int) Math.pow(num%10,3);
				num=num/10;
			}
			System.out.println((product==n)?"Armstrong Number":"Not an Armstrong Number");
		}
		
	}
}