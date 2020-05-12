
public class GraphTest {
	public static void main(String[] args) {
		Geometry2DPlane g = new Geometry2DPlane(-100, 100, -100, 100);
		g.setPoint(2, 3, 100);
		g.setPoint(-2, -3, 200);
		g.setPoint(100,100,10000);
		g.setPoint(-100,-100,20000);
		
		System.out.println(g.getValue(2, 3));
		System.out.println(g.getValue(-2, -3));
		System.out.println(g.getValue(100, 100));
		System.out.println(g.getValue(-100, -100));
		System.out.println(g.getValue(-10, -100));
		System.out.println(g.getValue(10, 100));
		
		System.out.println(g.toString());
		
	}
	
	
	

}
