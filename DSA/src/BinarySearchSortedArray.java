import java.text.DecimalFormat;

public class BinarySearchSortedArray {
	public static void main(String[] args) {
		
		int [] arr= new int[100000];
		for (int i = 1; i < 100001; i++) {
			arr[i-1]=i;
			
		}
		
		long startTime = System.nanoTime();    
		System.out.println(binarySearch(arr, 123423423, 0, arr.length-1));
		
		long diffBin=System.nanoTime()-startTime;
		System.out.println("Binary Search took " + diffBin + " nanoseconds ");
		
		startTime = System.nanoTime();
		System.out.println(classicSearch(arr, 123423423));
		long diffLin=System.nanoTime()-startTime;
		System.out.println("Classic linear search took " + diffLin + " nanoseconds ");
		
		double diffPercentage= ((double)diffLin/diffBin)*100;
		
		System.out.println("Improved performance by : " + new DecimalFormat("#.##").format(diffPercentage)  + "%");

	
	}

	static int binarySearch(int[] arr, int value, int leftIndex, int rightIndex)
	{
		if(leftIndex<=rightIndex)
		{
			int mid=(leftIndex+rightIndex)/2;
			if(value<arr[mid])
			{
				return(binarySearch(arr, value, leftIndex,mid-1));
			}
			else if(value>arr[mid])
			{
				return(binarySearch(arr, value, mid+1,rightIndex));
			}
			else
				return mid;
		}
		return -1;
	}
	
	static int classicSearch(int[] arr, int value)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value)
			{
				return i;
			}
		}
		return -1;
	}

}


