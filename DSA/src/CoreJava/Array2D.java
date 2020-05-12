package CoreJava;
import java.util.Arrays;
//Arrays.copyOf(arrayName, int n) creates a copy of an array from index 0 to n-1
//Arrays.copyOfRange(arrayName,int n, int n2) creates a copy of an array from index n to n2
//Arrays.toString(arrayName) prints entire array values e.g. [1,2,3,4,5]
//Arrays.sort(arrayName) sorts array in ascending order
//Arrays.binarysearch(arrayName,value) searches the array for value. Returns negative number when not found
public class Array2D {
	public static void main(String[] args) {
		
	
	int[][] arr = new int[10][15];
	
	//Using advanced For loop and Arrays.fill
	for(int x[]:arr)
	{
		//fills all values in array x with the value 5
		Arrays.fill(x,5);
	}
	for(int x[]:arr)
	{
		for(int z:x)
		{
			System.out.print(z + "-");
		}
		System.out.println("");
	}
	
	//Using conventional for loop
	//arr.length gives the width of array
	for(int i=0;i<arr.length;i++)
	{
		//arr[i].length will give height
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=j+i;
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		//arr[i].length will give height
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j] + " - "); 
		}
		System.out.println("");
	}
	
	String arr1d[]={"Lost","Love","Dhoka"};
	//Sorts any array in ascending order
	
	Arrays.sort(arr1d);
	
	System.out.println(Arrays.toString(arr1d));
	
	//Searches the array for value. Returns negative number when not found
	int val = Arrays.binarySearch(arr1d,"Love");
			
	System.out.println(val);
	
	}
}