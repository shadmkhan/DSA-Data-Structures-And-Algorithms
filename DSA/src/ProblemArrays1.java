
public class ProblemArrays1 {
	public static void main(String[] args) {
		int arr[] = {10,3,5,2,3,5,3,10,2,1};
		System.out.println(maxMirror(arr,3));
	}

	
	static public int maxMirror(int[] nums) {
		  int nums2[] = new int[nums.length];
		  int count=0;
		  int arrSum[] = new int[nums.length];
		  
		  int sum=0;
		  
		  for (int i=0; i<nums.length;i++)
		    nums2[nums.length-i-1]=nums[i];
		  
		  for (int i=0; i<nums.length;i++)
		  {
		    if(nums[i]==nums2[i])
		      sum++;
		    else
		    {
		      arrSum[count]=sum;
		      sum=0;
		      count++;
		    }
		  }
		  sum=0;
		  for (int c:arrSum)
			  sum+=c;
		  return sum;
		}
	
	static public int maxMirror(int[] nums,int x) {
	    int max = 0;
	    
	    for(int i = 0; i < nums.length; i++) {
	        int count = 0;
	        for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
	            if(nums[i + count] == nums[j]) {
	                count++;
	            } else {
	                max = Math.max(max, count);
	                count = 0;
	            }
	        }
	                                                                
	        max = Math.max(max, count);
	    }

	    return max;
	}


}
