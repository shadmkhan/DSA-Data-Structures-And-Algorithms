package Tries;

public class HashCode {
	
	public static void main(String[] args) {
		Dummy d1 = new Dummy();
		Dummy d2 = new Dummy();
		Dummy d3= d1;
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode()==d2.hashCode());
		System.out.println(d1.getClass());
		
	}

}


class Dummy
{
	int val1;
	int val2;
	
	
}