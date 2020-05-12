package SortingAlgorithms;

public class InsertionSort {
	public static void main(String[] args)
	{
		String[] arr= new String[]{"Well","Is","All"};
		SortingMechanisms<String> s =new SortingMechanisms<>();
		Integer[] arr2= new Integer[]{5,1,4,7,4};
		SortingMechanisms<Integer> i =new SortingMechanisms<>();
		s.printArray(arr);
		s.sortInsertion(arr,"asc");
		s.printArray(arr);
		
		i.printArray(arr2);
		i.sortInsertion(arr2,"asc");
		i.printArray(arr2);
	}
	
}
