package CoreJava;
public class BubbleSort
{
	public static void main(String[] args) {
		int arr[]={1,24,12,55,3,0};
		for(int i:arr)
		{
			System.out.println(i);
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {

				 if(arr[j]>arr[j+1])
				 {
					 int tmp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=tmp;;
					 
				 }
			}
		}
		System.out.println("Sorted List");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	
}