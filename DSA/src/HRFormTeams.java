
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HRFormTeams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        int t = scanner.nextInt();
        while(t>0)
        {
        	
        	int n= scanner.nextInt();
        	int arr[] = new int[n];
        	for (int i = 0; i < n; i++) {
        		
        		arr[i]=scanner.nextInt();	
			}
        	Arrays.sort(arr);
        	ArrayList<Integer> team= new ArrayList<Integer>();
        	int count=0;
        	team.add(1);
        	for (int i = 1; i < n; i++) {
        		
        		if(Math.abs( arr[i]-arr[i-1])>1 || arr[i]-arr[i-1]==0)
        		{
        			team.add(0);
        			count++;
        		}
        		team.set(count, team.get(count)+1);
			}
        	int min=team.get(0);
        	for (int i = 0; i < team.size(); i++) {
				if (team.get(i)<min)
					min=team.get(i);
				
			}
        	
        	res.append(min + "\n");
        	
        	t--;
        }
        System.out.println(res);
    }
}

