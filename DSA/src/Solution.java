import java.io.*;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	StringBuilder time = new StringBuilder( scanner.next());
    	if (time.charAt(time.length()-2)=='P' && !(time.substring(0, 2).equals("12")))    		
    		time.replace(0, 2, String.valueOf(Integer.parseInt(time.substring(0,2))+12)).replace(time.length()-2, time.length(), "");
    	else if(time.charAt(time.length()-2)=='A' && time.substring(0, 2).equals("12"))
    		time.replace(0, 2,"00").replace(time.length()-2, time.length(), "");
    	else
    		time.replace(time.length()-2, time.length(), "");
    	
    	System.out.println(time);
    	
   	}
    
}