package CoreJava;

public class MultiThreading {
	public static void main(String[] args) {
		/*
		 * Threads can be made by either extending Thread class or implementing Runnable Interface
		 * If you extend Thread class, you cannot extend any more classes(1 super class only), so its preferable to use Runnable
		 * The threads t1 and t2 below are made by extending Thread class while T3 implements Runnable
		 * Threads must define the public void run() method either ways
		 * Thread can be put to sleep using Thread.sleep(milliseconds)
		 *  
		 */
		
		Thread t1= new ThreadbyClass(1);
		
		t1.start();
		Thread t2= new ThreadbyClass(2);
		t2.start();
		
		
		Runnable t3 = new ThreadByInterface(3);
		
		new Thread(t3).setPriority(10);
		new Thread(t3).start();
		
		
		
		//As thread runs independently, the below statement will be printed before/in mid of execution of threads
		System.out.println("Execution continues...");
	}

}
