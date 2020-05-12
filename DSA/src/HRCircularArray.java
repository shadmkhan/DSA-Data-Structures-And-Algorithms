	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class HRCircularArray {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        
	        LinkedList<Integer> l = new LinkedList<>();
	        for(int a_i=0; a_i < n; a_i++){
	            l.add(in.nextInt());
	        }
	        while(k>0)
            {
            	l.addFirst(l.get(l.size()-1));
            	l.removeLast();
            	k--;
            }
	        for(int a0 = 0; a0 < q; a0++){
	            int m = in.nextInt();
	            System.out.println(l.get(m));   
	        }
	    }
	    
	}


