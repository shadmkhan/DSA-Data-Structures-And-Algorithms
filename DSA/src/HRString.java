import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        StringBuilder sb= new StringBuilder();
        String test="hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
           
            
            int index =0;
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
				if (arr[i]== test.charAt(index))
					index++;
				if(index>=test.length()) break;
            	
			}
            if(index==test.length())
            	sb.append("YES\n");
            else
            	sb.append("NO\n");
            
        }
        
        System.out.println(sb);
        
        
        
        
        
        
        
        
        
            }
}

