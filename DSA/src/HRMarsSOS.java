import java.util.*;


public class HRMarsSOS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        char[] arr = new char[]{'S','O','S'};
        int count=0;
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=arr[i%3])
				count++;
				
		}
        System.out.println(count);
    }
}
