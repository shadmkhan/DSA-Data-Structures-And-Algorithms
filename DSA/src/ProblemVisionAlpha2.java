//In NxN matrix how to find common numbers in all rows.  

public class ProblemVisionAlpha2 {
	public static void main(String[] args) {
	    int[][] a = {
	            { 10, 160, 200, 500, 500, },
	            { 4, 150, 160, 170, 500, },
	            { 2, 160, 200, 202, 203, },
	            { 3, 150, 155, 160, 300 },
	            { 3, 150, 155, 160, 301 } };

	    int n = a.length;
	    int[] x = new int[n];

	    for( ; x[0] < n; x[0]++ ) {
	        int val = a[0][x[0]]; 
	        boolean print = true;
	        for( int i = 1; i < n; i++ ) {
	            while (a[i][x[i]] < val && x[i] < n-1) x[i]++;              
	            if (a[i][x[i]] != val) print = false;               
	        }   
	        if (print) System.out.println(val);
	    }   
	}
}