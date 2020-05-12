package CoreJava;
import java.util.ArrayList;
import java.util.Collections;
/*
 * You can't make ArrayLists with primitive datatypes bcoz the class mentioned in generics has to be a descendant of Object class.
 * ArrayList.get(index) gets the value at index
 * ArrayList.set(index,value) sets/replaces the value at index with new value
 * ArrayList.toString prints all values in this format [1,2,3,4]
 * ArrayList.remove(index) removes the index item and ArrayList.removeAll() removes all the items
 * ArrayList.toArray(arrayName) copies all elements of ArrayList to array arrayName
 * Collections.sort(arrList) is used to sort all kinds of ArrayLists
 * 
 */

public class ArrayLists {
	public static void main(String[] args) {
		
		
		ArrayList arr = new ArrayList();
		arr.add("Shad");
		arr.add(123);
		arr.add(3.14);
		arr.add('c');
		
		/*for (Object i:arr)
		{
			System.out.println(i);
		}*/
		
		
		printArrayList(arr);
		//Collections.sort(arr); This gives a runtime error as its not possible to sort data from multi datatypes.
		printArrayList(arr);
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("Shad");
		arrStr.add("is");
		arrStr.add("Great");
		printArrayList(arrStr);
				
		print(arrStr.get(2));
		
		arrStr.add(0,"Mr.");
		
		printArrayList(arrStr);
		
		arrStr.set(0,"Prof.");
		printArrayList(arrStr);
		
		
		
		ArrayList<Integer> arrInt=new ArrayList<Integer>();
		arrInt.add(10);
		arrInt.add(20);
		arrInt.add(40);
		arrInt.add(30);
		
		printArrayList(arrInt);
		
		Collections.sort(arrInt);
		
		printArrayList(arrInt);
		
		print(arrInt.contains(30));
		print(arrInt.size());
		arrInt.remove(2);
		print(arrInt.size());
		print (arrInt.indexOf(40));
		
	}
	public static void printArrayList(ArrayList arrPrint)
	{
		System.out.println(arrPrint.toString());
	}
	
	
	public static void print(Object s){
		System.out.println(s);
	}
	
	
	
}
