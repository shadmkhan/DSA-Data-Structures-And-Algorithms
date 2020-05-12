package SingletonPattern;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Singleton s = new Singleton();
		 * The above commented code will give a Class not visible error as we have declared the constructor private
		 */
		
		Singleton s1 = Singleton.getInstance();
		s1.var1=100;
		s1.var2="Example";
		s1.var3=200.35;
		//Print the hash code of the object. This will help us check if the same instance is used next time.
		System.out.println("Hash code for object s1 : " + System.identityHashCode(s1));
		s1.printAllVars();
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("Hash code for object s2 : " + System.identityHashCode(s2));
		s2.printAllVars();
	}
}
