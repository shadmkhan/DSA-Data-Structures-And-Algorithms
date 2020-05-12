package CoreJava;

public class CodeBat {
	
	static int count =1;

	public static void main(String[] args) {
		String str="xxxx";
		
		System.out.println(last2(str));
	}
		
	
	static int countXX(String str) {
		  if (str.indexOf("xx")<0) return 0;
		   count=count +(countXX(str.substring(str.indexOf("xx")+2,str.length())));
		  return count;
		}
	
	public String stringX(String str) {
		
		  return(str.startsWith("x")?str.endsWith("x")?"x"+str.substring(1,str.length()-2).replace("x","")+"x":"x"+str.substring(1,str.length()-2).replace("x",""):str.substring(1,str.length()-2).replace("x",""));
		}

	
	static int last2(String str) {
	
			 int count=0;
			 
			    if (str.length()<=2) return 0;
					  
					  String lst2 = str.substring(str.length()-2);
					  
					  String newStr = str.substring(0,str.length()-2);
					  while(newStr.indexOf(lst2)>=0)
					  {
					    count++;
					    newStr=newStr.substring(newStr.indexOf(lst2)+1);
					  }
					  return count;
					
	}			
}
