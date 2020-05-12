import java.util.HashMap;
import java.util.Scanner;

public class AmNeedleInHaystackHashmap {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			String haystack = scanner.next();
			String needle = scanner.next();
			
			int lenHaystack= haystack.length();
			int lenNeedle = needle.length();
			
			HashMap<Character, Integer> haystackHM = new HashMap<Character, Integer>();
			HashMap<Character, Integer> needleHM = new HashMap<Character, Integer>();
			
			for(int i=0; i<lenNeedle;i++)
			{
				char keyHaystack=haystack.charAt(i), keyNeedle=needle.charAt(i);
				if(haystackHM.containsKey(keyHaystack))
				{
					haystackHM.put(keyHaystack, haystackHM.get(keyHaystack)+1);
				}
				else
					haystackHM.put(keyHaystack, 1);
				if(needleHM.containsKey(keyNeedle))
				{
					needleHM.put(keyNeedle, needleHM.get(keyNeedle)+1);
				}
				else
					needleHM.put(keyNeedle, 1);
				
			}
			
			for(int i=lenNeedle; i<lenHaystack;i++)
			{
				if(haystackHM.equals(needleHM))
					res.append(i-lenNeedle+",");
				
				
					
					if(haystackHM.get(haystack.charAt(i-lenNeedle))>1)
						haystackHM.put(haystack.charAt(i-lenNeedle), haystackHM.get(haystack.charAt(i-lenNeedle))-1);
					else
						haystackHM.remove(haystack.charAt(i-lenNeedle));
				
						
						
					
					char keyHaystack=haystack.charAt(i);
					if(haystackHM.containsKey(keyHaystack))
					{
						haystackHM.put(keyHaystack, haystackHM.get(keyHaystack)+1);
					}
					else
						haystackHM.put(keyHaystack, 1);
					
					
					
				
			}
			
			if(haystackHM.equals(needleHM))
				res.append(lenHaystack-lenNeedle+",");
						
			res.append("\n");

			t--;
		} 
		
		scanner.close();
		System.out.println(res);

	}
}