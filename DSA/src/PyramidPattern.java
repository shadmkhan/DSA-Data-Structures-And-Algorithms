
public class PyramidPattern {
	public static void main(String[] args) {
		int n = 3;
		makePyramid(n);
		
	}
	
	public static void makePyramid(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<n*2;j++)
			{
				if((j>=i) && (i+j+n)<n*2) 
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	

}
