package CoreJava;

import java.util.regex.*;
public class RegexClass {
	public static void main(String[] args) {
		//String s = "The sm.khan2010@gmail.com is a good boy";
		//String strRegex = "\\w+"; //Whole word
		//String strRegex = "\\S+"; //Not a space
		//String strRegex = "[a-z0-9.\\-_]{3,}+[@]+[a-z]{3,}+[.]+[a-z]{3}";
		
		
		String s = "babab";
		String strRegex = "\\b(..)\\1{0,}\\b";

		ExecuteRegex(strRegex, s+s.charAt(1));
	}

	public static void ExecuteRegex(String strRegex, String s)
	{
		Pattern regexP =Pattern.compile(strRegex);
		Matcher regexM = regexP.matcher(s);
		//System.out.println(regexM.find());
		while(regexM.find())
			System.out.println(regexM.group());
		
		
	}
	
	
	
}
