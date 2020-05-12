import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {
	
	public static void main(String[] args) {
		Set<Integer> hSet = new TreeSet();
		Set<Integer> tSet = new TreeSet();
		hSet.add(1);
		hSet.add(5);
		hSet.add(3);
		hSet.add(12);
		hSet.add(22);
		hSet.add(2);
		hSet.add(47);
		hSet.add(4);
		
		System.out.println("Printing Hashset");
		for(Integer i:hSet)
		{
			System.out.println(i);
		}
	}
	
	
}
