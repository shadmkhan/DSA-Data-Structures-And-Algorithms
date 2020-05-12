package CoreJava;
public class SelectionSort
{
	public static void main(String[] args) {
		int arr[]={10,20,30,50,15};
		int min=0;	
		for(int x:arr)
		{
			System.out.println(x);
		}
		int i=0,j=0;
		
		for(i=0;i<arr.length;i++)
		{
			min=i;
			for(j = i+1;j<arr.length;j++)
			{
				
				if(arr[j]<arr[min])
				{
					min=j;
					
				}
				
			}			
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
			
			
		}
	
		System.out.println("After sorting");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
	}
}