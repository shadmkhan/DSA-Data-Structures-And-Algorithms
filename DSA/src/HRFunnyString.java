import java.util.Scanner;


public class HRFunnyString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t>0)
        {
        	String s = scanner.next();
        	int len = s.length()-1;
        	boolean blnFunny=true;
        	for (int i = 1; i <= len; i++) 
        	{
				if(Math.abs((s.charAt(i)-s.charAt(i-1)))!=Math.abs((s.charAt(len-i+1)-s.charAt(len-i))))
				{
					blnFunny=false;
					break;
				}
					
					
			}
        	if(blnFunny)
        		System.out.println("Funny");
        	else
        		System.out.println("Not Funny");
        	
        	t--;
        }
        
        
        
    }
}