import java.util.ArrayList;
import java.util.StringTokenizer;

//https://www.codechef.com/problems/CHEFDETE
public class ProblemDetective 
{
	public static void main(String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));


		int length=Integer.parseInt(r.readLine());
		
		StringBuilder s = new StringBuilder();
		
			ArrayList<Integer> arr = new ArrayList<Integer>();
			StringTokenizer s1 = new StringTokenizer(r.readLine());
			while(s1.hasMoreTokens())
				arr.add(Integer.parseInt(s1.nextToken()));
			for(int i=0;i<arr.size();i++)
			{
				boolean flag=false;

				for(int j=0;j<arr.size();j++)
				{
					if (arr.get(j)==i) flag=true;
				}
				if (!flag) s.append(i + " ");
			}
			
		System.out.println(s);
		
	}
}
