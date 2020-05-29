

import java.util.Scanner;

public class HRPangrams {

    public static void main(String[] args) {
    	int[] arr = new int[26];
    	Scanner scanner = new Scanner(System.in);
    	String s = scanner.nextLine();
    	s= s.toLowerCase();
    	for (int i = 0; i < s.length(); i++) {
    		if(s.charAt(i)>=97 && s.charAt(i)<=(97+26))
			arr[s.charAt(i)-97]++;
		}
    	boolean blnFlag = true;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]<1) blnFlag=false;
		}
    	if(blnFlag)
    		System.out.println("pangram");
    	else
    		System.out.println("not pangram");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}