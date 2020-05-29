import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProblemMusic {

	public static void main (String[] args) throws java.lang.Exception
	{

		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int tCases=Integer.parseInt(r.readLine());

		StringBuilder res= new StringBuilder();
		for (int t = 1; t <= tCases; t++)

		{
			int size=Integer.parseInt(r.readLine());

			String input =r.readLine();
			StringBuilder s = new StringBuilder(input.toString());
			
			//System.out.println(s);

			StringTokenizer s1 = new StringTokenizer(r.readLine());
			int m=Integer.parseInt(s1.nextToken());
			int x=Integer.parseInt(s1.nextToken());
			int y=Integer.parseInt(s1.nextToken());

			ArrayList<Long[]> arr = new ArrayList<Long[]>();
			ArrayList<Integer> seperator = new ArrayList<Integer>();


			while(x<=y)
			{
				for(int k=1; k<=m;k++){
					if (k>size/(x+1))
					{
						for(int l=1;l<=k;l++)
						{
							for(int j=l;j<size;j+=k)
								seperator.add(j);

							int count =0;
//							if (seperator.isEmpty()) return;
							for(Integer c:seperator)
							{
								s.insert(c+count, ",");
								count++;
							}
							seperator.clear();
							
							arr.add(StrArrtoLngArr(s.toString().split(",")));
							System.out.println(s);
							s.setLength(0); s.append(input);
						}

					}

					
				}

				x++;


			}
			//System.out.println(getGCD(arr.get(0)));
			long highest=0;
			for (Long[] i:arr){
			
				if(arr.indexOf(i)==34){
					continue;
				}
				long temp =getGCD(i);
				//System.out.println(arr.indexOf(i));
				
				
				highest=Math.max(highest, temp);
			
			}
			res.append(highest + "\n");
			
			

		}
		res.setLength(res.length()-1);
		System.out.println(res);

	}



	public static Long[] StrArrtoLngArr(String[] array)
	{
		Long[] arr = new Long[array.length];
		for(int i=0; i<array.length; i++)
		{
			
				arr[i] = Long.parseLong(array[i]);           
		}
		return arr;
	}
	
	private static long findGCD(long number1, long number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
	
	
	public static long getGCD(Long[] a) {
		// the GCD of a number with itself is... itself
		long gcd = a[0];

		// compute incrementally
		for( int i=1; i<a.length; i++ ) {
			gcd = findGCD( gcd, a[i] );
		}

		// return result
		return gcd;    
	}
}
