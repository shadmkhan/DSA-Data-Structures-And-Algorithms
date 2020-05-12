package CoreJava;

public class Constructors {
	public static void main(String[] args) {
		X a =new X() ;	
		System.out.println(a.a); 
	}
//Multiple constructor overloading is allowed
//Whenever an object of derived class is declared, the base class' default constructor is called automatically
//You can call a constuctor from a method of the same class using this();

}

class X
{
	 protected int a=10;
	
	public X()
	{
		System.out.println("In Constructor");
	}
	public X(int a)
	{
		this();
		this.a=a;
	}
	
}

class S1 extends X
{
	
}

