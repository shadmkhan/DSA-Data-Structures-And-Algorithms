package CoreJava;
import java.util.regex.*;
public class ProblemValidateEmailRegex {
	public static void main(String[] args) {
		Validate("superb1988@rediffmail.org");
		
		
		
	}
	//^ - first character
	//$ - last character
	
	public static void Validate(String strEmail) {
		Pattern regP = Pattern.compile("^[A-Za-z0-9\\-_.]+[@]+[A-Za-z0-9\\-]+[.][a-z.]{2,5}$");
		Matcher regM = regP.matcher(strEmail);
		if (regM.find()) System.out.println("Valid Email \n " + regM.group()); else System.out.println("Invalid Email\n"+ strEmail);
				
		
	}
}
