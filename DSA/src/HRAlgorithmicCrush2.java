import java.util.Scanner;

public class HRAlgorithmicCrush2 {

    public static void main(String[] args) {
        
	Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int start[] = new int[N+1];
    int end[] = new int[N+1];
 
    int M = in.nextInt();
    int a = 0;
    int b = 0;
    int k = 0;
    for(int i=0;i<M;i++){
        a = in.nextInt();
        b = in.nextInt();
        k = in.nextInt();
        start[a] += k;
        end[b] += k;
    }
    long sum =0;
    long max =0;


    for(int i=1;i<N+1;i++){
       sum+=(start[i]);
        if(sum>max){
            max= sum;
        }
        sum = sum -end[i];

    }
    System.out.println(max);
    }
}