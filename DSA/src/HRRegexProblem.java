import java.util.*;
import java.util.regex.*;

public class HRRegexProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        in.close();
         Pattern p = Pattern.compile( "([A-Z])" );
        
        Matcher m = p.matcher( s );
        int count=0;
        while (m.find())
        	count++;
        System.out.println(count+1);
        
    }
}