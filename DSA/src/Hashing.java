import java.util.ArrayList;
import java.util.Arrays;

public class Hashing
{ 
	public static void main(String args[])
	{ 
		
		Hash a = new Hash(11);
		Integer[] items = {21,13,87,331,20,41,53,56,55,59};
		a.add2(items);
		a.displayAll();
		a.changesize(25);
		a.displayAll();
		
		System.out.println("Found at "+a.find(30));
		
		

	}


}

class Hash
{ 
	private int size;
	private int arr[];
	private int available;
	Hash(int size)
	{
		this.size=size;
		arr= new int[size];
		Arrays.fill(arr,-1);
		available = size;
	}

	//Simply use the key as index
	public void add(int keys[])
	{
		for(int i=0;i<keys.length;i++)

			arr[keys[i]]=keys[i];
	}

	//Simply use the key%size as index
	public void add2(Integer keys[])
	{
		if(keys.length>available) 
		{
			System.out.println("Not enough space");
			return;
		}

		for(int i=0;i<keys.length;i++)
		{
			int index = keys[i]%this.size;
			while(arr[index]!=-1)
			{
				System.out.println("Clash at index : "+index +" for value : " + keys[i]);
				index++;
				if(index==size) index =0;

			}

			arr[index]=keys[i];
			available--;

		}


	}
	//Simply use key%size but increment it with a random jump
	public void add3(Integer keys[])
	{
		if(keys.length>available) 
		{
			System.out.println("Not enough space");
			return;
		}

		
		for(int i=0;i<keys.length;i++)
		{
			//Use any prime number instead of 7 below
			int jump=7-(keys[i]%7);
					
			int index = keys[i]%this.size;
			while(arr[index]!=-1)
			{
				System.out.println("Clash at index : "+index +" for value : " + keys[i]);
				index+=jump;
				if(index>=size) index = index-size;

			}

			arr[index]=keys[i];
			available--;

		}


	}
	
	public int find(int key)
	{
		int index = key%size;
		int ind2=index;
		while(arr[index]!=key)
		{
			index++;
			if(index==size) index=0;
			if(index==ind2) return-1;
		}

		return index;
	}

	public void displayAll()
	{
		if (available ==size) return;
		for(int i=0;i<size;i++)
		{

			System.out.println(i + ": "+arr[i]);
		}
	}
	
	
	private boolean isPrime(int n)
	{
		if(n==2) return true;
		if(n%2==0) return false;
		
		for(int i = 3; i*i<n; i++)
		{
			if(n%i==0) return false;
		}
		return true;
		
	}
	private int getNewSize(int n)
	{
		if (isPrime(n)) return n;
		while(!isPrime(n))
		{
			n++;
		}
		return n;
		
	}
	
	public void changesize(int s)
	{
		
		//int arrReturn[s];
		
		ArrayList<Integer> arrReturn = new ArrayList<Integer>();
		
		
		this.size=getNewSize(s);
		int count=0;
		
		for(int c:arr)
		{
			if(c!=-1)
				arrReturn.add(c);			
				
		}
		
		arr= new int[size];
		Arrays.fill(arr,-1);
		available = size;
		System.out.println(arrReturn);
		//System.out.println(arrReturn.toArray(new Integer[arrReturn.size()]));
		add3(arrReturn.toArray(new Integer[arrReturn.size()]));
		
		
		
		
	}
	
	
	
}

