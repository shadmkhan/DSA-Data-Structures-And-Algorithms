package CoreJava;
import java.io.*;


public class Prime {
	public static void main(String[] args) {
		//Time check

		
		int n=0;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			n= Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		long startTime = System.nanoTime();
		//Old method - slow
		/*for (int i = 3; i <= (int) Math.sqrt(n); i+=2) {
		if(n%i==0){
			
			
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " ns"); 
			return;
			
			}
		}*/
		
		startTime = System.nanoTime();
		if((n%2==0)&&(n!=2)||(n<=1))
		{
			System.out.println("Not Prime");
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " ns"); 
			return;
		}
		for(int i=3;i*i<=n;i+=2)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime .. Divisible by : " + i);
				long endTime = System.nanoTime();
				System.out.println("Took "+(endTime - startTime) + " ns"); 
			
				return;
			}
				
		}
		
		System.out.println("Prime");
	
	
	 
	
	}
	
	
}
