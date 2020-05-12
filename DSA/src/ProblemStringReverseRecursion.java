
public class ProblemStringReverseRecursion {

	public static void main(String[] args) {
		
		String r = "Barfi";
		System.out.println(reverse(r));
	}

	static String reverse(String r)
	{
		if (r.length()<=1) return r;
		return(reverse(r.substring(1))+r.charAt(0));
		
	}
	
	
}
