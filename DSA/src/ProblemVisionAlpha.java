import java.util.Arrays;



public class ProblemVisionAlpha {
	public static void main(String[] args) {
		
		int arr[]={4, 9, 1, 32, 13};
		
		Arrays.sort(arr);
		int diff=arr[1]-arr[0]; 
		for (int i = 0; i < arr.length-1; i++) {
			 diff=Math.min(diff,((arr[i+1])-arr[i]));
			
		}
		
		System.out.println(diff);
		
	}
}
