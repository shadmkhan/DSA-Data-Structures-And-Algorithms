package CoreJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Roman {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();

		while(t>0)
		{
			String roman= scanner.next();

			
			res.append ((isValidRoman(roman)? toDecimal2(roman):-1) + "\n");
			t--;
		} 

		System.out.println(res);
	}

	public static boolean isValidRoman(String roman)
	{
		Pattern p = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		Matcher m = p.matcher(roman);
		return m.find();
	}

	public static int toDecimal( String roman)
	{
		if(roman.startsWith("M")) return(1000+ toDecimal(roman.substring(1)));
		if(roman.startsWith("CM")) return(900+ toDecimal(roman.substring(2)));
		if(roman.startsWith("D")) return(500+ toDecimal(roman.substring(1)));
		if(roman.startsWith("CD")) return(400+ toDecimal(roman.substring(2)));
		if(roman.startsWith("C")) return(100+ toDecimal(roman.substring(1)));
		if(roman.startsWith("XC")) return(90+ toDecimal(roman.substring(2)));
		if(roman.startsWith("L")) return(50+ toDecimal(roman.substring(1)));
		if(roman.startsWith("XL")) return(40+ toDecimal(roman.substring(2)));
		if(roman.startsWith("X")) return(10+ toDecimal(roman.substring(1)));
		if(roman.startsWith("IX")) return(9+ toDecimal(roman.substring(2)));
		if(roman.startsWith("V")) return(5+ toDecimal(roman.substring(1)));
		if(roman.startsWith("IV")) return(4+ toDecimal(roman.substring(2)));
		if(roman.startsWith("I")) return(1+ toDecimal(roman.substring(1)));

		return 0;




	}

	public static int toDecimal2( String roman)
	{
		int lastNumber=0;
		int decimal=0;
		char[] arr=roman.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {


			switch(arr[i])
			{
			case 'M':

				decimal=(lastNumber>1000? decimal-1000:decimal+1000);
				lastNumber=1000;
				break;
			case 'D':

				decimal=(lastNumber>500? decimal-500:decimal+500);
				lastNumber=500;
				break;
			case 'C':

				decimal=(lastNumber>100? decimal-100:decimal+100);
				lastNumber=100;
				break;
			case 'L':

				decimal=(lastNumber>50? decimal-50:decimal+50);
				lastNumber=50;
				break;
			case 'X':

				decimal=(lastNumber>10? decimal-10:decimal+10);
				lastNumber=10;
				break;
			case 'V':

				decimal=(lastNumber>5? decimal-5:decimal+5);
				lastNumber=5;
				break;
			case 'I':

				decimal=(lastNumber>1? decimal-1:decimal+1);
				lastNumber=1;
				break;


			}


		}
		return decimal;

	}






}
