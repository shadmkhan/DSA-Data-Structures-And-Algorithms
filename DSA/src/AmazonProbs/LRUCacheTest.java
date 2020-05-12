package AmazonProbs;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheTest {
	public static void main(String[] args) {
		LRU l = new LRU(4);
		l.add(0, 10);
		l.add(1, 20);
		l.add(2, 30);
		l.add(3, 40);
		
		l.print();
		l.get(1);
		//l.add(4, 50);
		l.print();
		System.out.println(l.mapLRU.toString());
	}
	
	

	 
}


class LRU
{
	
	LinkedList<Integer> listLRU;
	HashMap<Integer, Integer> mapLRU;
	int limit;
	
	public LRU(int limit)
	{
		listLRU= new LinkedList<>();
		mapLRU= new HashMap<>();
		this.limit=limit;
	}
	
	public void add(int pageId, int pageData)
	{		
		 
		if(listLRU.size()==limit)
			mapLRU.remove(listLRU.removeLast());
		
		listLRU.addFirst(pageData);
		mapLRU.put(pageData,pageId);
		
	}
	public int get(int pageData)
	{
		 

		if(!mapLRU.containsKey(pageData))	return -1;
		int index = mapLRU.get(pageData);
		
		if(listLRU.peekFirst()!=index)
		{
			listLRU.addFirst(listLRU.remove(index));
			mapLRU.put(pageData, 0);
		}
		
		
		return index;
	}
	
	public void print()
	{
		System.out.println(listLRU.toString());
	}
}