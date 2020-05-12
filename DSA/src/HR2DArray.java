import java.util.Scanner;
//https://www.hackerrank.com/challenges/2d-array?h_r=next-challenge&h_v=zen
public class HR2DArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int [6][6];
		for(int i=0;i<arr.length;i++)
		{
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		
		int sum=-60;
		for (int i=0;i<=3;i++)
		{
			for (int j=0;j<=3;j++)			
				sum=Math.max(getSumOfHourglass(i,j, arr), sum);
		}
		System.out.println(sum);
	}
	public static int getSumOfHourglass(int row, int offset, int arr[][])
	{
		
		return arr[row][offset+0]+arr[row][offset+1]+arr[row][offset+2]+arr[row+1][offset+1]+arr[row+2][offset+0]+arr[row+2][offset+1]+arr[row+2][offset+2];
		
	}

}
