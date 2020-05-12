package AmazonProbs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//You have a string of numbers, i.e. 123. You can insert a + or - sign in front of ever number, or you can leave it empty. Find all of the different possibilities, make the calculation and return the sum. 
//For example; 
//+1+2+3 = 6 
//+12+3 = 15 
//+123 = 123 
//+1+23 = 24 
//... 
//-1-2-3 = 6 
//... 
//Return the sum of all the results.
//

public class PlusMinusNone {
	public static void main(String[] args) {
		String num= String.valueOf(123);
		String val[]=new String[]{"+","-",""};
		ScriptEngineManager s = new ScriptEngineManager();
		ScriptEngine eng = s.getEngineByName("JavaScript");
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val.length; j++) {
				for (int k = 0; k < val.length; k++) {
					String str= (val[i] +num.charAt(0)+  val[j] +num.charAt(1) +val[k] + num.charAt(2));
					try {
						System.out.println(str + " = " +eng.eval(str));
					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		
		
	}
}
