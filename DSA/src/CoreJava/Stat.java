package CoreJava;

public class Stat {
	static int x=122;
	public static void main(String[] args) {
		Temp1.x=100;
		Temp2.T();
		System.out.println(x + "-" + Temp1.x);
		
	}
}

class Temp1{
	static int x=123;
}

class Temp2{
	static void T()
	{
		System.out.println(Temp1.x);		
		Temp1.x=200;
	}
}