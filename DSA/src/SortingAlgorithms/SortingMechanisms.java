package SortingAlgorithms;

 class SortingMechanisms<T extends Comparable> {
	
	public T[] sortInsertion( T[] arr, String order )
	{
		for (int i = 1; i < arr.length; i++) 
		{
			T key=arr[i];
			int j=i;
			while((j>0) && (arr[j-1].compareTo(key)<0 && order=="desc" ||arr[j-1].compareTo(key)>0 && order!="desc") )
			{
				arr[j]=arr[j-1];
				j--;
			}				
			arr[j]=key;			
		}
		return arr;
	}
	
	
	
	
	
	public void printArray(T[] arr)
	{
		for(T i:arr)
		{
			System.out.print(i+" , ");
		}
		System.out.println();
	}

}
