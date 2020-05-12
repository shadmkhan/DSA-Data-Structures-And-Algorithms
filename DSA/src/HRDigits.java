import java.math.BigInteger;
import java.util.Scanner;

public class HRDigits {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int m= scanner.nextInt();
		int t=scanner.nextInt();
		StringBuilder result= new StringBuilder();
		while(t>0){

			int k=scanner.nextInt();

			long numCount=0;
			BigInteger fromPower=BigInteger.valueOf((long)(Math.pow(10,k-1)));
			BigInteger toPower = BigInteger.valueOf((long)(Math.pow(10,k)));
			
			for(BigInteger i=fromPower;i.compareTo(toPower)<0;i=i.add(BigInteger.ONE))
			{
				
				boolean discard= false;
				int arr[]= new int[10];
				String s= i.toString();
				
				for(char c:s.toCharArray())
		        {
		        
					arr[c-'0']++;
		        }
				
				
				/*while(temp>0)
				{
					int digit = (int)(temp%10);
					arr[digit]++;
					temp=temp/10;
				}*/
				
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]>m)
					{
						discard=true;
						result.append("Number: "+ i.toString()  + "\n");

						break;
					}
				}
				if(!discard)
				{
					numCount++;

				}
			
				
			}
			
			//result.append(numCount % 1000000007 + " \n");
			result.append(9* (int) Math.pow(10, k-1) -numCount + " \n");
			//result.append(numCount + " \n");

			//result.append("9 * "+numCount /9 + " = " + numCount+"\n");
			
			t--;
		}
				
		System.out.println(result);
			

	}

}
