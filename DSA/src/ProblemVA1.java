
public class ProblemVA1 {
//Count Pythagoramic triplets in an array
	public static void main(String[] args) {
		int arr[]={2,3,4,5,30};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if((Math.pow(arr[j], 2) + Math.pow(arr[k], 2)==Math.pow(arr[i], 2)) && (arr[i]!=arr[j]) && (arr[i]!=arr[k]) &&(arr[j]!=arr[k]))
					{
						count++;
						System.out.println(arr[j] + "^ +" + arr[k] + "^ = " +arr[i]);
					}
						
					
				}
			}
		}
	}
	
	
}
