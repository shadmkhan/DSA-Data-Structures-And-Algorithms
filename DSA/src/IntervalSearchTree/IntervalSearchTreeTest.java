package IntervalSearchTree;

public class IntervalSearchTreeTest {

	public static void main(String[] args) {
		IntervalSearchTree ist = new IntervalSearchTree();

		ist.insertData(100, 200);
		ist.insertData(150, 190);
		ist.insertData(30, 40);
		ist.insertData(80, 90);
		ist.insertData(200, 205);
		ist.insertData(20, 25);
		
		
		ist.printMaxInorder();
		//ist.printLevelorder();
		
		
	}

}
