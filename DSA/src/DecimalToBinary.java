
public class DecimalToBinary {

	public static void main(String[] args) {
		int n=50;
		System.out.println(getBinary(n));
	
	}
	
	public static long getBinary(int n)
	{
		long res=0;
		int t=0;
		System.out.println(n);
		if (n==1) return 1;
		while(n>1)
		{
			
			t= (int) (Math.log(n)/Math.log(2));
			res = res+(long)(Math.pow(10, t));
			n-=Math.pow(2, t);
		}
		return res;
	}
}