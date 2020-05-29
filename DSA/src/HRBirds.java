import java.util.Scanner;

public class HRBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        int [] birdType = new int[6];
        for(int types_i=0; types_i < n; types_i++){
        	birdType[ types[types_i]]++;
            
        }
        //System.out.println(Arrays.toString(birdType));
        int max=0;
        for(int i=1;i<birdType.length;i++)
        {
        	if (birdType[i]>max)
        		if (birdType[i]==birdType[max])
        			max=Math.min(max, i);
        		else
        		max=i;
        		
        }
        
        System.out.println(max);
        // your code goes here
    }
}