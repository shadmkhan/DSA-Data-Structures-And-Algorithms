
public class DecimalToHex {
	public static void main(String[] args) {
		System.out.println(decimal2hex(66));
	}
	
	public static String decimal2hex(int d) {
	    String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    //System.out.println(digits.length());
	    if (d <= 0) return "0";
	    int base = 16;   // flexible to change in any base under 16
 	    String hex = "";
	    while (d > 0) {
	        int digit = d % base;              // rightmost digit
	        hex = hex+digits.charAt(digit);  // string concatenation
	        d = d / base;
	    }
	    return hex;
	}

}
