import java.util.Scanner;

public class HRCrate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int[][] crate = new int[c][2];



		for(int crate_i=0; crate_i < c; crate_i++){
			for(int crate_j=0; crate_j < 2; crate_j++){
				crate[crate_i][crate_j] = in.nextInt();
			}
		}


		int ans=0;

		int arrProd[] = new int[crate.length];


		for(int crate_i=0; crate_i < c; crate_i++){
			{
				arrProd[crate_i]=crate[crate_i][0] * crate[crate_i][1];
				//System.out.println(Arrays.toString(arrProd));
			}

		}
		int n2=n;
		while(n>0)
		{
			int max=0;
			int maxVal=-1;


			for(int i=0;i<arrProd.length;i++)
			{
				if(arrProd[i]> arrProd[max])
				{
					max=i;
					maxVal=arrProd[max];
				}
			}


			for(int i=0;i<arrProd.length;i++)
			{
				if(maxVal==arrProd[i])
				{

					if(crate[i][1]>crate[max][1])
					{
						max=i;
					}



				}
			}

			//Take max
			int tmp=0;

			for(int i =0; i<Math.min(crate[max][0],n);i++)
			{
				tmp++;

			}
			
			
			
			arrProd[max]=-1;
			ans+=tmp*crate[max][1];
			System.out.println( (n-(n-tmp)) + " * " + crate[max][1] +" = " +tmp*crate[max][1] );
			
			n=n-tmp;

		}   

		System.out.println(ans);

	}
}