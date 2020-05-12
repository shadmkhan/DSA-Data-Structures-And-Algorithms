
public class HRElectronsAndPositrons {
	static Geometry2DPlane g= new Geometry2DPlane(-5, 5, -5, 5);
	public static void main(String[] args) {
		
		int arrItems[]={1,0,0,0};
		
		int xCordE=1;
		int yCordE=0;
		
		
		
		int xCordP=1;
		int yCordP=-1;
		
		///g.setPoint(xCordE, yCordE, 'E');
		//g.setPoint(xCordP, yCordP, 'P');
		int collisionCount=0;
		
		
		for(int t=0;t<arrItems.length;t+=4)
		{
			xCordE=arrItems[t];
			yCordE=arrItems[t+1];
			xCordP=arrItems[t+2];
			yCordP=arrItems[t+3];
			
			g.setPoint(xCordE, yCordE, 'E');
			g.setPoint(xCordP, yCordP, 'P');
			
			System.out.println(g.toString());
			
			for(int i=0;i<4;i++)
			{
			g.resetValue(xCordE, yCordE);
				g.resetValue(xCordP, yCordP);
							
				
				if (Math.abs(xCordE-xCordP)>Math.abs(yCordE-yCordP))
				{
					
		
					if (Math.abs(xCordE-xCordP)>=Math.abs(yCordE-yCordP))
						xCordP+=(xCordP>xCordE)?-1:1;
					else					
						yCordP+=(xCordP>xCordE)?1:-1;
					
					xCordE+=(xCordE>xCordP)?-1:1;
				}
				else
				{
					
					

					if (Math.abs(xCordE-xCordP)>=Math.abs(yCordE-yCordP))
						xCordP+=(xCordP>xCordE)?-1:1;
					else					
						yCordP+=(xCordP>xCordE)?1:-1;
					
					yCordE+=(xCordE>xCordP)?-1:1;
					
				}
					
				if (xCordE==xCordP && yCordE==yCordP)
				{
					g.setPoint(xCordP, yCordP, 'C');
					
					
					collisionCount++;
					System.out.println(g.toString());
					System.out.println(collisionCount);
					
					break;
				}
				
				if (g.getValue(xCordE, yCordE)!='C')
				{g.setPoint(xCordE, yCordE, 'E');
				g.setPoint(xCordP, yCordP, 'P');}
				
				System.out.println(g.toString());
				
			}
		}
		
		
		
		
		//System.out.println(shift(1,-1,"down"));
		
		
		
	}
	
	public static int[] shift(int x, int y, int dX, int dY)
	{
		
		if(g.getValue(x+dX, y+dY)!=0)
		{
			int tmp=g.getValue(x, y);
			g.setPoint(x, y, g.getValue(x+dX, y+dY));
			g.setPoint(x+dY, y+dY,tmp);
			
			return new int[]{x+dX,y+dY,-1};
		}
		else
		{
			g.setPoint(x+dX, y+dY, g.getValue(x, y));
			g.setPoint(x, y, 0);
			return new int[]{x+dX,y+dY,0};	
		}
		
		
	}
	
	public static boolean shift(int x, int y,String direction)
	{
		int dX=0, dY=0;
		switch(direction.toLowerCase())
		{
		case "left":
			dX=-1;
			dY=0;
			break;
		case "right":
			dX=1;
			dY=0;
			break;
		case "up":
			dX=0;
			dY=-1;
			break;
		case "down":
			dX=0;
			dY=1;
			break;
		}
		if(g.getValue(x+dX, y+dY)!=0){
			return false;
		}
		else
		{		
			g.setPoint(x+dX, y+dY, g.getValue(x, y));
			g.setPoint(x, y, 0);
			return true;
		}
		
	}
	

}
