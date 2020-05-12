package AmazonProbs;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {


    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */        
    	
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(-1);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(')
                stk.push(i);
            else if(s.charAt(i)==')')
            {

            	stk.pop();
            	if(stk.empty())
            		stk.push(i);
            	else
            		count=Math.max(count, i-stk.peek());

            }
        	
        }
        System.out.println(count);

        
    }
}
