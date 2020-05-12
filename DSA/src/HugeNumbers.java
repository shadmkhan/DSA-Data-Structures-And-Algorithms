import java.util.LinkedList;
import java.util.Scanner;

public class HugeNumbers {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			String s1 = scanner.next();
			String s2 = scanner.next();
			
			res.append(add(s1,s2) + "\n");
			t--;
			
			
		} 
		scanner.close();
		System.out.println(res);
	}
	
	
	public static StringBuilder add(String s1, String s2)
	{
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();
		
		StringBuilder res = new StringBuilder();
		int len1=s1.length(),len2=s2.length();
		
		
		for(int i=len1-1;i>=0;i--)
			l1.add(s1.charAt(i)-'0');
		
		for(int i=len2-1;i>=0;i--)
			l2.add(s2.charAt(i)-'0');
		
		int carry=0;
		int len=(len1>len2)?len1:len2;
		
		for(int i=0;i<len+1;i++)
		{
			int sum=0;
			try {
				 sum = l1.get(i)+l2.get(i);
				
			} catch (Exception e) {
				try {
					sum = l1.get(i);
				} catch (Exception e2) {
					
					try {
						 sum = l2.get(i);
						
					} catch (Exception e3) {if(carry==0)break;}
				}
				
			}
			//int sum = l1.get(i)+l2.get(i);
			result.add(sum%10+carry);
			carry=sum/10;			
			
		}
		
		for (int i = result.size()-1; i >=0; i--) {
			res.append(result.get(i));
		}
		
		return res;
		

	}

}
