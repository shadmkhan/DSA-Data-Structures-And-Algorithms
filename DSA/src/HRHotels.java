import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HRHotels {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String arrMain[]=scanner.nextLine().split(" ");
		int m = scanner.nextInt();
		String arr[][]= new String[m][2];
		for (int i = 0; i < m; i++) {
			arr[i][0] = String.valueOf(scanner.nextInt());
			scanner.nextLine();
			arr[i][1]=String.valueOf(scanner.nextLine());		

		}
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
			
			for (int j = 0; j < arrMain.length; j++) {
				String arrComp[]= arr[i][1].split(" ");
				
					
				
			}
			
		}
		
		

	}
}

