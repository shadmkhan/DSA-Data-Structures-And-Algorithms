package CoreJava;
import java.text.DateFormat;
import java.util.*;

public class ThreadbyClass extends Thread{
	int threadNo =1;
	public void run(){
		Date now;
		DateFormat dF;
		DateFormat tF;
		Locale l;
		
	
		l=new Locale("en");
		for (int i = 0; i <10 ; i++) {
			now=new Date();
			dF=DateFormat.getDateInstance(DateFormat.DEFAULT, l);
			tF=DateFormat.getTimeInstance(DateFormat.DEFAULT, l);
			
			System.out.println("Executing Thread " + threadNo);
			
			try{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				System.out.println( "Thread T" + threadNo + " interrupted");
			}
			
		}
		
		
	}
	
	ThreadbyClass(int threadNo)
	{
		this.threadNo=threadNo;
	}
	

}
