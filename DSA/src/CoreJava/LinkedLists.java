package CoreJava;
import java.util.LinkedList;
/*
 * LinkedList has all the functions of ArrayLists.
 * LinkedList.poll gets and deletes the first element.
 * LinkedList.peek gets the first element and returns null incase of no items in list.
 * +++peek should be used instead of get(0) to check if the list has elements or not.
 * LinkedList.addFirst and LinkedList.addLast are used to add elements in the list in first and last positions respectively
 * LinkedList.getFirst and LinkedList.getLast are used to get elements from first and last positions of the list respectively
 * LinkedList.poll is used to get and delete first item from list.
 * LinkedList.push(value) is used to push the value at last
 * LinkedList.pop is used to pop/delete the first value from the list.
 * 
 */
public class LinkedLists {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Shad");
		ll.add(123);
		ll.add(123.34);
		print(ll);
		
		LinkedList<String> llStr = new LinkedList<String>();
		llStr.add("Shad");
		llStr.add("is");
		llStr.add("a");
		llStr.add("great");
		llStr.add("guy");
		
		print(llStr);
		
		llStr.addFirst("Mr.");
		print(llStr);
		
		print(llStr.getLast());
		
		print(llStr.get(0));
		
		print(llStr);
		print("Poll : " + llStr.poll());
		print(llStr);
		
		
		print("Peek : " + llStr.peek());
		print(llStr);
		
		print("Pop : " +llStr.pop());
		print(llStr);
		
				
	}
	
	/*public static void printLinkedList(LinkedList ll)
	{
		for(Object i:ll)
		{
			System.out.println(i);
		
		System.out.println(ll);
	}
*/
	public static void print(Object ll)
	{
		System.out.println(ll);
	}
}