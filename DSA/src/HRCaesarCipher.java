
import java.util.Scanner;

public class HRCaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        //s=s.toLowerCase();
        
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
        
			if(s.charAt(i)>=97 && s.charAt(i)<=(97+25))
			{
				int c;
				if((s.charAt(i)+k)>(97+25))
				{
					c=((s.charAt(i)+k)-26);
					while(c>(97+25))
						c-=26;
				}
				else
					c=(s.charAt(i)+k);
				
				res.append((char) c);
				
			}
			else if(s.charAt(i)>=65 && s.charAt(i)<=(65+25))
			{
				int c;
				if((s.charAt(i)+k)>(65+25))
				{
					c=((s.charAt(i)+k)-26);
					while(c>(65+25))
						c-=26;
				}
				else
					c=(s.charAt(i)+k);
				
				res.append((char) c);
				
			}
			else
				res.append(s.charAt(i));
		}
        System.out.println(res);
        
    }
}