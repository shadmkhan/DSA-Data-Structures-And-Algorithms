import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaps
{
	public static void main(String[] args) {
		
		int arr[][]={{1,2,4},{2,5,4},{6,5,2}};
		int arrT[]= new int[3];
		
		for (int j = 0; j < arr[1].length; j++) {
			arrT[j]=arr[0][j];
		}
		
		
		int count=0;
		int n=0;
		int c=0;
		for (int i = 1; i < arr[0].length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if(arr[i][j]==arrT[j])
				{
					c++;
				}
			}

		}
		
		
		System.out.println(n);
	}
}