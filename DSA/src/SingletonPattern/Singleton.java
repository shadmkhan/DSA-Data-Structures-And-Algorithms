package SingletonPattern;

public class Singleton {
	
	private static Singleton firstInstance=null;
	
	int var1;
	String var2;
	double var3;
	
	public void printAllVars(){
		System.out.println(var1 + " - " + var2 + " - " + var3);
	}
	
	//A private constructor to prevent instantiation of class
	private Singleton(){}
	
	public static Singleton getInstance()
	{
		if(firstInstance==null)
		{
			firstInstance=new Singleton();
			
		}
		return firstInstance;
	}

}
