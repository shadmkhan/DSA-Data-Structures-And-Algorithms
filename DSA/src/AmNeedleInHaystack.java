import java.util.Scanner;

public class AmNeedleInHaystack {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			String haystack = scanner.next();
			String needle = scanner.next();
			
			long lenNeedle=needle.length();
			long lenHaystack=haystack.length();
			
			long prod=1;
			
			for(int i=0;i<lenNeedle;i++)
			{
				prod*=needle.charAt(i);
			}
			
			for(int i=0;i<lenHaystack;i++)
			{
				if(i+lenNeedle>lenHaystack) break;
				long tempProd=1;
				for(int j=i;j<i+lenNeedle;j++)
				{
					tempProd*=haystack.charAt(j);
				}
				if(tempProd==prod)
				{
					res.append(i+",");
				}
				
			}
			res.append("\n");

			t--;
		} 
		
		scanner.close();
		System.out.println(res);

	}
}