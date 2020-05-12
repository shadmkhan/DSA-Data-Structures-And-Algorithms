package CoreJava;

public class ThreadByInterface implements Runnable{
	
	int threadNo=1;
	public void run()
	{		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Executing Thread " + threadNo + " By Interface");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			
			}
		}
	}
	public ThreadByInterface(int threadNo) {
		this.threadNo=threadNo;
	
	}

}
