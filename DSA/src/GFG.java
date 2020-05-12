import java.util.Scanner;

public class GFG {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			double h = scanner.nextDouble();
			double m = scanner.nextDouble();
			
			if(m==60) m=0d;
			double r =  Math.abs(((60*h)-(11*m))/2);
			
			int result=  (int) Math.ceil(r);
			
			if(result>180) {r=360-r;result=360-result;}
			
			if((result-r)>0.0) result--;

			
			res.append(result+"\n");

			t--;
		} 
		scanner.close();
		System.out.println(res);

	}
}