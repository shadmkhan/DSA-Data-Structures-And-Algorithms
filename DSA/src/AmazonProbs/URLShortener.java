package AmazonProbs;

import java.util.HashMap;

public class URLShortener {
	static int base=62;
	public static void main(String[] args) {

		//101-java.com
		//105-oracle.com
		//108-amazon.com
		int code=10;
		System.out.println(shortenURL(code));
		System.out.println(decode(shortenURL(code)));
	}
	
	public static String shortenURL(int code)
	{
		String all = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		
		if(code<=0) return "0";
		String result="";
		while(code>0)
		{
			result=all.charAt(code%base)+result;			
			code=code/base;
		}
		return result;
		
	}
	public static int decode(String shortURL)
	{

		int result=0;
		for (int i = 0; i < shortURL.length(); i++) {
			char c= shortURL.charAt(i);
			if(shortURL.charAt(i)>='0' && shortURL.charAt(i)<='9')
			{
				result=(result*base) + c -'0';
			}
			if(shortURL.charAt(i)>='A' && shortURL.charAt(i)<='Z')
			{
				result=(result*base) + c -'A' +10;
			}
			
			if(shortURL.charAt(i)>='a' && shortURL.charAt(i)<='z')
			{
				result=(result*base) + c -'a' + 36;
			}
				
		}
		return result;

		
	}

}
