package CoreJava;
public class ArmstrongList
{
	
		public static void main(String args[])
		{
			
		int n = 1000000;

				
				
				for (int i=10;i<=n;i++)
				{
					int digits=3;
					digits= (int) Math.log10(i)+1;
					int num=i;
					int product=0;
					while(num!=0)
					{
						product=product +(int) Math.pow(num%10,digits);
						num=num/10;
					}
					if(product==i) System.out.println(i);				}
				
			}
			

	
}