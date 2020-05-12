public class ProblemBitwise 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
	
		 
		int tCases=Integer.parseInt(r.readLine());
				
		for (int i = 1; i <= tCases; i++) {

			StringBuilder s1= new StringBuilder();
			StringBuilder s2= new StringBuilder();
					
			int count=Integer.parseInt(r.readLine());
			for (int j = 0; j < count; j++) {
				
				int num = Integer.parseInt(r.readLine());
				s1.append(num^((num>>16)<<16));
				s1.append(" ");
				s2.append(num>>16);
				s2.append(" ");
				
			}
			
			System.out.println("Case " + i +":");
			System.out.println(s1);
			System.out.println(s2);
			
		}
					
			
		
		}
	
	
}