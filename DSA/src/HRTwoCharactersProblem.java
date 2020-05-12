import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Problem: https://www.hackerrank.com/challenges/two-characters?h_r=next-challenge&h_v=zen

public class HRTwoCharactersProblem {

	public static void main(String[] args) {
		
				Scanner in = new Scanner(System.in);
		        int len = in.nextInt();
		        String s = in.next();
		        boolean charList[]= new boolean[26];
		        
		        for(char c:s.toCharArray())
		        {
		        	charList[c-'a']=true;
		        }
		        ArrayList<Character> arr = new ArrayList<>();
		        for(int i=0;i<charList.length;i++)
		        {
		        	if (charList[i])
		        		arr.add((char) (i + 'a'));
		        }
		        boolean found=false;
		        int max=0;
		        if (arr.size()>2)
		        {
		        	int n= arr.size();
		        	
		        	for(int i=0;i<n;i++)
		        	{
		        		for(int j = i+1; j<n; j++)		        		{
		        			String x =s;
		        			for(Character c:arr)
		        			{
		        				if (c!=arr.get(i) && c!= arr.get(j))
		        				{
		        					x=x.replaceAll(c.toString(), "");
		        					if (isT(x))       					
		        					
		        					{
		        						found=true;
		        						max=Math.max(x.length(), max);
		        					}
		        				}
		        						
		        			}
		        			
		        			
		        		}
		        	}

		        	
		        		System.out.println(max);	
		        }
		        else if (arr.size()==2)
		        System.out.println(2);
		        else
		        	System.out.println(0);
		        	        
		        		
		}
	
	
	
	public static boolean isT(String s)
	{
		String strRegex = "\\b(..)\\1{0,}\\b";
		Pattern p =Pattern.compile(strRegex);
        Matcher m1 = p.matcher(s);
        Matcher m2 = p.matcher(s + s.charAt(1));
        return m1.find()|m2.find();
	}
	
	

	}


