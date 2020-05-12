import java.util.Arrays;

public class ProblemArray {
	public static void main(String[] args) {
		//find the numbers from an array whose difference is closest to 0 O(n^2)
		
		int arr[]={0,-7,-1,5,-10};
		solution1(arr);
		
		//find the numbers from an array whose sum is closest to 0  O(nlogn)
		solution2(arr);
		
	}
	static void solution1(int[] arr)
	{
		int m1=0,m2=1;
		int minVal=Math.abs(arr[m1]-arr[m2]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(Math.abs(arr[i]-arr[j])<minVal)
				{
					m1=i;m2=j;
					minVal=Math.abs(arr[m1]-arr[m2]);
				}
			}
		}
		System.out.println(arr[m1] + " and "+ arr[m2]);
	}
	
	static void solution2(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//int l=0, r=arr.length-1;
		//int min1=l,min2=r;
		//int min=Math.abs(arr[l]+arr[r]);
		int sum, min_sum = Integer.MAX_VALUE;
		int l = 0, r = arr.length-1;
		 
		  // variable to keep track of the left and right pair for min_sum
		  int min_l = l, min_r = arr.length-1;
		  
		while(l < r)
		  {
		    sum = arr[l] - arr[r];
		 
		    /*If abs(sum) is less then update the result items*/
		    if(Math.abs(sum) < Math.abs(min_sum))
		    {
		      min_sum = sum;
		      min_l = l;
		      min_r = r;
		    }
		    if(sum < 0)
		      l++;
		    
		    else
		      r--;
		  }
		System.out.println(arr[min_l]+ " and " +arr[min_r]);
	}
	
	
	
	
	

}

