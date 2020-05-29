import java.util.Arrays;
import java.util.Scanner;

public class HRAbsDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
			if (a[i]-a[i-1]<min)
				min = a[i]-a[i-1];
		}
        System.out.println(min);
        // your code goes here
    }
}
