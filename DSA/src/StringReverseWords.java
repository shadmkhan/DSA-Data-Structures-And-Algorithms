
public class StringReverseWords {
	public static void main(String[] args) {
		String original = "solution simpler A";
		String arr[]= original.split(" ");
		StringBuilder s = new StringBuilder();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			s.append(arr[i] + " ");
		}
		System.out.println(s);
	}

}
