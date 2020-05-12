import java.util.Scanner;

public class HRPolygon {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int arr[] = new int[4];
		StringBuilder res= new StringBuilder();
		int i=0;
		int squares=0, rectangles=0,others=0;
		while(scanner.hasNext())
		{

			arr[i]=scanner.nextInt();
			if(i>2){

				if(arr[0]>0 && arr[3]>0)
				{
					
				
					if((arr[0]==arr[2])||(arr[1]==arr[3]))
					{
						if((arr[0]==arr[2])&&(arr[1]==arr[3]))
						{
							if(arr[0]==arr[3])
								squares++;
							else
								rectangles++;						
						}

					}
					else{
						others++;
					}
				}
				else{
					others++;
				}
			


			i=-1;

		}





		i++;

	}
	System.out.println(squares +" " + rectangles+ " " + others);


}

}
