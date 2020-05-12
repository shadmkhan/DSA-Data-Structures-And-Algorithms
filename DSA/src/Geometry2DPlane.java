
public class Geometry2DPlane {
	private int xSize;
	private int ySize;
	private int xMin;
	private int yMin;
	private int arr[][];
	
	
	Geometry2DPlane(int xMin,int xMax, int yMin, int yMax)
	{
		
		this.xMin=xMin;
		this.yMin=yMin;
		xSize=(xMax-xMin) +1;
		ySize=(yMax-yMin) +1;
		arr=new int[this.xSize][this.ySize];
		
	}
	
	public boolean setPoint(int xCord, int yCord, int val)
	{
		int x = xCord-xMin;
		int y = yCord-yMin;

		if((x < xMin || x>=xSize) || (y < yMin || y>=ySize))
		{
			return false;
		}
		arr[x][y]=val;
		return true;
		
	}
	
	public int getValue(int xCord,  int yCord)
	{
		int x= xCord-xMin;
		int y= yCord-yMin;
		if((x < xMin || x>=xSize) || (y < yMin || y>=ySize))
		{
			throw new IllegalArgumentException("Out of graph error");
		}
		
		return(arr[x][y]);
		
	}
	
	public void resetValue(int xCord, int yCord)
	{
		this.setPoint(xCord, yCord, 0);
		
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(int i=0;i<xSize;i++)
		{
			for(int j=0;j<ySize;j++)
			{
				s.append( ((arr[j][i]==0)?'.':(char)arr[j][i]) + " ");
			}
			s.append("\n");
		}
		
		return s.toString();
	}

}
