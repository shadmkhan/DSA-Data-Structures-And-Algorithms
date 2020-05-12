import java.util.Scanner;

public class HRAnagram2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();
		while(t>0)
		{
			String s = scanner.next();
			int len = s.length();
			
			int sum=0;
			String s2=s;
			for(int i=0;i<len;i++)
			{
				
				for(int j=i+1;j<len;j++)
				{
					if (s.charAt(i)==s2.charAt(j))
							sum++;
					
				}
				
				s2=s2.replaceAll(String.valueOf(s.charAt(i)),"0");
			}
			res.append((sum==0)?0:sum *2-(sum%2==0?1:0) + "\n");
			t--;
		}
		System.out.println(res);

}
	
	public static boolean isAnagram(String s1, String s2)
	{
		if (s1.length()!=s2.length()) return false;
		long prodS1 =1, prodS2=1;
		
		for(char c:s1.toCharArray())
			prodS1= prodS1*(c-64);
		for(char c:s2.toCharArray())
			prodS2= prodS2*(c-64);
		if (prodS1==prodS2)
			return true;
		else
			return false;
		
	}
	
}
