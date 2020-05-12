package CoreJava;
class Base
{
  static int x=10;
  float y;
  double z;
   int GetX()
  {
    return(x);
  }
}

class Sub1 extends Base
{
}

public class HW
{
  public static void main(String args[])
  {
    int i;
    Base b1 = new Base();
	Sub1 s1 = new Sub1();
    b1.x=10;
    
    
	
  }
  

}
