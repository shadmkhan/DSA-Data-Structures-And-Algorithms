import java.util.StringTokenizer;

public class ProblemCatsAndDogs {

	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));


		int tCases=Integer.parseInt(r.readLine());
		
		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= tCases; i++)
		outerloop:
		{
			
			StringTokenizer s1 = new StringTokenizer(r.readLine());
			int d=Integer.parseInt(s1.nextToken());
			int c=Integer.parseInt(s1.nextToken());
			int l=Integer.parseInt(s1.nextToken());
			
			

			for(int k =c;k>=(Math.min(c-(d*2),0));k--)
			{
				if(l==d*4+(k*4))
				{
					s.append("yes\n");
					break outerloop;
				}


			}
			s.append("no\n");





			//System.out.println(s2);

		}
		s.setLength(s.length() -1);
		System.out.println(s);
	}
}
