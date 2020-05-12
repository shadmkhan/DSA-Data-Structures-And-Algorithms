import java.util.ArrayList;

public class ProblemUniqueCharactersinString {
	public static void main(String[] args) {
		String original = "GoodGoodGoodGoodGood";
		StringBuilder result =new StringBuilder(); 
		ArrayList<Character> arr=new ArrayList<Character>();
		for(char c: original.toCharArray())
		{
			if (!arr.contains(c))
			{
				arr.add(c);
				result.append(c);
			}
		}
			
		System.out.println(result);
	}
	
	
	
	

}
