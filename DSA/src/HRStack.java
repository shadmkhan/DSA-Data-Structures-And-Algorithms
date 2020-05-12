
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRStack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder res =new StringBuilder();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack<Character> stk = new Stack<>();
            char arr[] = s.toCharArray();
            boolean blnFlag=true;
            for(char c:arr)
            {
            	switch(c){
            	
            	case '[':
            	case '(':
            	case '{':
            		stk.push(c);
            		break;
            	case ']':
            		if(!stk.isEmpty()&& stk.peek()=='[')
            		     stk.pop();            		
            		else           			
            			blnFlag=false;
            		break;
            		
            			
            	case '}':
            		if(!stk.isEmpty()&& stk.peek()=='{')
            		     stk.pop();            		
            		else           			
            			blnFlag=false;
            		break;
            		
            	case ')':
            		if(!stk.isEmpty()&& stk.peek()=='(')
            		     stk.pop();            		
            		else           			
            			blnFlag=false;
            		break;
            		
            	
            	}
            	
            }
            
            if (stk.isEmpty()&&blnFlag)                
               res.append("YES\n");
            else
               res.append("NO\n");
            
            
                
                
        }
       
        System.out.println(res);
    }
}
