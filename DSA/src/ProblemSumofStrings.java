
public class ProblemSumofStrings {
	public static void main(String[] args) {
		
		String original ="10,30,20,40";
		String arr[]= original.split(",");
		int sum=0;
		for(String s:arr)
		{
			sum+=Integer.parseInt(s);
		}
		System.out.println(sum);
		
	}
}
