
public class ProblemNthFibonacci {

	public static void main(String[] args) {
		long n=5;
		long fib=1,f1=1,f2=0;
		
		for (long i = 1; i <= n; i++) {		
			
			fib=f1+f2;
			f2=f1;
			f1=fib;	
			
		}
		System.out.println(fib);
	}
	
	
}
