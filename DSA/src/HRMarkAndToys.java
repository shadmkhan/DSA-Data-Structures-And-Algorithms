import java.util.Arrays;
import java.util.Scanner;

public class HRMarkAndToys {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),k=scanner.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=(scanner.nextInt());
        int count=0;
        long sum=0;
        Arrays.sort(prices);
        for(Integer i : prices)
        {
        	if(i+sum<=k)
        	{
        		sum+=i;
        		count++;
        	}
        	else
        		break;
        }
       
        
        
                		
        
        // Compute the final answer from n,k,prices 
        System.out.println(count);
    }
}


