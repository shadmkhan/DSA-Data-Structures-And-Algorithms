package SortAlgos;

import java.util.Arrays;

public class QuickSort
{
	public static void main(String[] args) {
	
		int arr[]= new int[]{1, 79, 5, 74, 77, 3, 11, 111, 0, 2, 3, 4};
		QS(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static public void QS(int arr[], int left, int right)
	{
		if(left>=right)
			return;
		int pivot= arr[(left+right)/2];
		int newPivot=partitionArray(arr, left, right, pivot);
		QS(arr,left,newPivot-1);
		QS(arr,newPivot,right);
	}
	
	static public int partitionArray(int arr[], int left, int right, int pivot)
	{			
		while(left<=right)
		{
			while(arr[left]<pivot)
				left++;
			while(arr[right]>pivot)
				right--;
			if(left<=right)
			{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			}
			
		}
		return left;
	}
}