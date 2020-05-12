package CoreJava;
import java.io.*;

public class Exception {
	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		while (n==0 || m==0)
		{
			System.out.print("Please enter a number:");
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				m = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("Divide By? :");
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				n = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}	
			catch(NumberFormatException e)
			{
				System.out.println("Input Format Incorrect. Please try again");
				
				
			}
		}
		
		
		
		try {
			System.out.println(m + "/" + n + " = " + m/n); 
					
			
		} catch (ArithmeticException e) {
			System.out.print(e.getMessage());
			return;
		}
		finally
		{
			System.out.println("Thanks for playing");
		}
		
		System.out.println("No errors");
		
	}
	
	

}
