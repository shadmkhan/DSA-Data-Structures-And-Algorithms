package CoreJava;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(Rec(10));
	}
	public static int Rec(int i)
	{
		if (i==1){System.out.println("Returned number: 1"); return 1; }
		i=i+(Rec(i-1));
		System.out.println("Returned number: " + i);
		return i;
		
	}
}
