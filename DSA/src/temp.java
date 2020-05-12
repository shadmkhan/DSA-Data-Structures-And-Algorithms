import java.util.ArrayList;
import java.util.Arrays;

public class temp
{
	public static void main (String[] args) throws java.lang.Exception

	{
		int arr[]=  {1,7,4,3,5,5,2,1,1,8,9,8,0,1,1,2};
		int arr2[]= Arrays.copyOf(arr,arr.length);


		ArrayList<ArrayList<Integer>> arrList= new ArrayList<ArrayList<Integer>>();  

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> tempArr = new ArrayList<Integer>();
			int count=0;
			for (int j = 0; j < arr2.length; j++) {

				if(arr[i]==arr2[j] &&arr2[j]!=-1)
				{
					tempArr.add(arr[i]);
					arr2[j]=-1;

				}


			}
			if(tempArr.size()>1) arrList.add(tempArr);


		}

		for(ArrayList c: arrList)
		{			
			System.out.println(c);
		}

	}




}  