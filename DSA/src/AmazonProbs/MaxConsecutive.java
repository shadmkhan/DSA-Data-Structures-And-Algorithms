package AmazonProbs;

public class MaxConsecutive {
	public static void main(String[] args) {
		/*
		 * 	A = "ffgggtvshjsdhjfffffffhvjbjcharu" 
		 *	Find the max consecutive repitative chracter 
		 *	Output : f -> 7
		 */
		
		String a="ffgggggtvshjsdhjfffffffhvjbjcharu";
		int max=0, sum=0;
		char prev=a.charAt(0);
		for (int i = 1; i < a.length(); i++) {
			
			if(a.charAt(i)==prev) sum++;
			
			else{
				max=Math.max(sum, max);
				sum=0;			
				}
			
			prev=a.charAt(i);
		}
		System.out.println(max+1);
	}

}
