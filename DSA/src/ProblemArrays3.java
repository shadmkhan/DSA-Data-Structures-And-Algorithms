import java.util.Arrays;

public class ProblemArrays3 {
public static void main(String[] args) {
	int arr[]={3, 4, 1};
	System.out.println(Arrays.toString(fix34(arr)));
}
public static int[] fix34(int[] nums) {
	  
	  for(int i =0; i<nums.length;i++)
	    if(nums[i]==3)
	    {
	    boolean blnFlag=true;
	      for(int j=0;j<nums.length;j++)
	      {
	    	if(nums[j]==3&&j<i) blnFlag=false;
	    		
	    	if(nums[j]==4)
	    	{
	    		if(blnFlag==true)
	    		{
	    		int temp=nums[i+1];
	    		nums[i+1]=nums[j];
	    		nums[j]=temp;
		          
		          blnFlag=false;
	    		}
	    		else
	    			blnFlag=true;
	    	}
	      }
	    }
	  return nums;
	  
	}

}
