package AmazonProbs;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class QueueNode{
	int vertex;
	int distance;
	QueueNode(int v, int d)
	{
		this.vertex=v;
		this.distance=d;

	}
}
public class HRSnakesAndLadders {
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder res = new StringBuilder();


		while(t>0)
		{
			int board[]=new int[100];
			Arrays.fill(board, -1);
			int ladders = scanner.nextInt();
			for (int i = 0; i < ladders; i++) 
				board[scanner.nextInt()-1]=scanner.nextInt()-1;

			int snakes = scanner.nextInt();
			for (int i = 0; i < snakes; i++) 
				board[scanner.nextInt()-1]=scanner.nextInt()-1;


			System.out.println(findMinimumPath(board));


			t--;
		}

		scanner.close();
		System.out.println(res);

	}

	public static int findMinimumPath(int[] board)
	{
		int boardLength=board.length;
		boolean visited[]=new boolean[boardLength];
		Arrays.fill(visited, false);
		Queue<QueueNode> q = new LinkedList<>();

		q.add(new QueueNode(0, 0));
		int v=0;
		int d=0;
		visited[0]=true;

		while(!q.isEmpty())
		{
			v = q.peek().vertex;
			d= q.peek().distance;
			if(v>=boardLength-1) break;
			q.poll();
			for (int i = v+1; i <= v+6 && i<boardLength; i++) {
				if(!visited[i])
				{
					q.add(new QueueNode((board[i]>-1)?board[i]:i,d+1));
					visited[i]=true;

				}

			}		
			
//			Queue<QueueNode> q1=new LinkedList<>();
//			q1.addAll(q);
//			while(!q1.isEmpty())
//			{
//				QueueNode temp=q1.poll();
//				System.out.print(temp.vertex + ":" + temp.distance+" - ");
//			}
//			System.out.println();
		}
		
		if(v<boardLength-1)
			return -1;
		else
			return d;


	}

}
