import java.util.Arrays;

/*Find the index in the array where sum of all left elements == sum of all right elements
 * Array will have both positive and negative integer
 * Use better approach than O(n^2) 
 */
public class ProblemVA2 {
	static int[] arr = {-6,-5,-3,2,9,10,-20,-7};
	public static void main(String[] args) {
		System.out.println(canBalance(arr));
		//System.out.println(partition(arr.length/2));
	}
	
	public static  boolean canBalance(int[] nums) {
		  int sum=0;
		  
		  int lsum=0;
		  
		  for(int c:nums)
		    sum+=c;
		  
		  for(int c:nums)
		  {
		    lsum+=c;
		    if (lsum==(sum-lsum))
		      return true;
		    
		  }
		  return false;  
		}


	
	static int partition(int pivot)
	{
		if (pivot<-1 || pivot>=arr.length)
			return -1;
		int leftsum= sum(Arrays.copyOfRange(arr, 0, pivot));
		int rightsum= sum(Arrays.copyOfRange(arr, pivot+1,arr.length-1));
		
		if(leftsum==rightsum) return pivot;
		
		if(arr[pivot]<0)
			pivot=(leftsum>rightsum)?pivot-1:pivot+1;
		if(arr[pivot]>0)
			pivot=(leftsum<rightsum)?pivot-1:pivot+1;
		
		partition(pivot);
		return pivot;
		
	}
	
	static int sum(int arr[])
	{
		int sum=0;
		for(int c: arr)
		{
			sum+=c;
		}
		return sum;
	}

}
