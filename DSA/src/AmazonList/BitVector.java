package AmazonList;

public class BitVector {

	public static void main(String[] args) {
		long numberOflnts = ((long) Integer.MAX_VALUE) + 1;
		byte[] bitfield = new byte [(int) (numberOflnts / 8)];



		int n = 10;
		/* Finds the corresponding number in the bitfield by using
		 * the OR operator to set the nth bit of a byte
		 * (e.g., 10 would correspond to the 2nd bit of index 2 in
		 * the byte array). */
		
		//bitfield [n / 8] |= 1 << (n % 8);
		
		System.out.println(n%8);
		
		System.out.println(getBinary(n));
		
		System.out.println(1 << (n % 8));
		
		System.out.println(bitfield [n / 8] |= 1 << (n % 8));
		
		
		
		for (int i = 0; i < bitfield.length; i++) {
			for (int j = 0; j < 8; j++) {
				/* Retrieves the individual bits of each byte. When 0 bit
				 * is found, finds the corresponding value. */
				if ((bitfield[i] & (1 << j)) != 0) {
					System.out.println (i * 8 + j);
				}          
			}          
		}          
	}          

	static int getBinary(int dec)
	{
		int bin=0;
		while(dec>0)
		{
			int digit =   (int) (Math.log(dec)/Math.log(2));
			bin+=Math.pow(10, digit);
			dec-=Math.pow(2, digit);
		}
		return bin;
		
	}

}


