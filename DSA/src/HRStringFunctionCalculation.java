
import java.util.LinkedHashMap;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/string-function-calculation

public class HRStringFunctionCalculation {
	static LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
		scanner.close();
		int max=0;
		for (int i = 0; i <s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub=s.substring(i,j+1);
				Integer c = hm.get(sub);
				int len=sub.length();
				if(c==null)
				{
					hm.put(sub,len);
					max=Math.max(len,max);
				}
				else
				{
					hm.put(sub,(c/len +1)*len);
					max=Math.max((c/len +1)*len,max);
				}
				
				
			}
		}
		
		//combine(s,new StringBuffer(),0);
		
		//int max=0;
		/*for(Map.Entry<String, Integer> m: hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
			max=Math.max(m.getValue(),max);
			
		}*/
		System.out.println(max);
		
	}

}
