import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRSocks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();           
        }        
        
        Arrays.sort(c);
        int count=0;
        int num=0;
        System.out.println(Arrays.toString(c));
        for(int c_i=1; c_i < n; c_i++){
        	count++;
        	if(c[c_i]!=c[c_i-1]){
        		num+=count/2;
        		count=0;
        		
        	}
        			
        	
        }
        count++;
        num+=count/2;
        System.out.println(num);
    }
}
