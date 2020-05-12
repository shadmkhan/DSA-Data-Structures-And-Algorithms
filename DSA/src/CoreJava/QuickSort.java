package CoreJava;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int arr[] = {1,79,5,74,77,3,11,111,0,2,3,4};
		System.out.println(Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void quicksort(int arr[], int left, int right)
	{
		if(left>=right)
		{
			return;
		}
		int pivot = (left+right)/2;
		int index=partition(arr,left,right,pivot);
		quicksort(arr,left,index-1);
		quicksort(arr,index,right);
	}
	
	static int partition(int arr[],int left,int right, int pivot)	
	{
		while(left<=right)
		{
			while(arr[left] < arr[pivot])
				left++;
			while(arr[right] > arr[pivot])
				right--;
			if(left<=right)
			{
			swapIndexes(arr,left,right);
			left++;
			right--;
			}
			
		}
		
		
		
		
		return left;
	}
	
	static void swapIndexes(int arr[],int ind1, int ind2)
	{
		int temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
}
