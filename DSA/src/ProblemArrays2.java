import java.util.Arrays;
/*
 * 
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

public class ProblemArrays2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(squareUp(6)));
	}
	public static int[] squareUp(int n) {
		  int arr[]=new int[(int)Math.pow(n,2)];
		  int count=0;
		  
		  
		  for(int i=0;i<n;i++)
		  {
			  
		    for(int j=0;j<n;j++)
		    {
		      if(j+i+1>=n) arr[count]= n-j;else arr[count]= 0;
		      count++;
		      
		    }
		    
		    
		  }
		  return arr;
		}

}
