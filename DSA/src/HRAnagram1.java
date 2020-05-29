import java.util.Scanner;

public class HRAnagram1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder result = new StringBuilder();
		while(t>0)
		{
			String s = scanner.next();
			int len = s.length();
			
			if (len%2!=0)
			{
				result.append("-1\n");
			}
			else
			{
				
				result.append(noOfChangesNeeded(s.substring(0,(len/2)), s.substring((len)/2)) + "\n");
			}
				
			
			t--;
		}
		System.out.println(result);
			
	}	
	
	
	public static int noOfChangesNeeded(String s1, String s2)
	{
		
		StringBuilder ss1= new StringBuilder(s1);

		StringBuilder ss2= new StringBuilder(s2);

		return(GetUniqueChars(ss1, ss2));		
		
		
	}
	
	
	//This method compares the product of all the character codes in 2 strings with O(n) complexity
	//Another method would be to compare the strings' character array after sorting them which would have higher O(nlogn) complexity
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
	
	public static int GetUniqueChars(StringBuilder s1, StringBuilder s2)
	{
		int res=0;
		for(int i=0;i<s1.length();i++)
		{
			int currIndex =s2.indexOf(String.valueOf(s1.charAt(i)));
			
			if (currIndex<0) 
				res++;
			else
				s2.setCharAt(currIndex, '0');
				//s2=s2.replaceFirst(String.valueOf(c1), "0");
		}
		return res;
	}
	
	
	//This method fails because it will return true is the strings are like "abbcd" "accbd"
	/*public static boolean isAnagram(String s1, String s2)
	{
		if (s1.length()!=s2.length()) return false;
		for(char c:s1.toCharArray())
			if (s2.indexOf(c)<0) return false;
		
		return true;
	}*/
	
}


