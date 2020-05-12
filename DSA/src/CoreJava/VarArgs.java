package CoreJava;

public class VarArgs {
	//VarArgs become array internally

	public static void main(String... args) {
		VarArgs a=new VarArgs();
		System.out.println(a.Sum(10,20,30,40,150));
		System.out.println(a.Product(10,20,30,40,150));
	}
	public int Sum(int...a)
	{
	
		//While using the varargs, you must follow some rules otherwise program code won't compile. The rules are as follows:
		//There can be only one variable argument in the method.
		//Variable argument (varargs) must be the last argument.
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		return sum;
		
	}
	public int Product(int...a)
	{
	

		int pr=1;
		for(int i=0;i<a.length;i++)
		{
			pr*=a[i];
		}
		return pr;
		
	}
}
