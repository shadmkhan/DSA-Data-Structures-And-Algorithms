import java.util.*;
public class HRLongestCommonSubsequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int a[]=new int[n+1];
		int b[]=new int [m+1];
		for(int i=1;i<=n;i++){
			a[i]=in.nextInt();
		}
		for(int i=1;i<=m;i++){
			b[i]=in.nextInt();
		}
		int c[][]=new int [m+1][n+1];
		int d[]=new int [5900];
		int k=0;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(b[i]==a[j]){
					c[i][j]=1+c[i-1][j-1];
				}

				else {
					c[i][j]=Math.max(c[i-1][j],c[i][j-1]);
				}
			}
		}
		int i=m,j=n;
		st : while(i>0){
			while(j>0){

				if(c[i][j]==c[i][j-1]){--j;}
				else if(c[i][j]==c[i-1][j]){--i;}
				else{d[k]=b[i];++k;--i;--j;}
				if(i==0 || j==0){break st;}
			}
		}
		for(int h=k-1;h>=0;h--){
			System.out.print(d[h]+" ");
		}
	}}