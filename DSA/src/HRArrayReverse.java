import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//https://www.hackerrank.com/challenges/arrays-ds
public class HRArrayReverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
	    String s = br.readLine();
	    String arr[] = s.split(" ");
	    
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	System.out.print(arr[i] + " ");
	    }
	    
	    
	    
	}
	
}
