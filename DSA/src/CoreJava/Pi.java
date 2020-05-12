package CoreJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pi
{
	public static void main(String[] args) {
		double j=3;
		double pi=4.0d;
		String response="y";
		while(response.equalsIgnoreCase("y"))
		{
			pi=pi-(4/j)+ (4/(j+2));
			j+=4;
			System.out.println(pi);
			System.out.print("Do you want to continue?:");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				response= br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}