package CoreJava;
public class Inheritance
{
	int val=10;
	protected int val2=100;
	public int val3=1000;
  public static void main(String args[])
  {
    Animal cow = new Mammal(true,true);
    
    System.out.println(cow.no_of_legs);
    


    /* In the above case only Base class can refer to an object of sub class not vice versa
     * In such cases, it is only allowed to access methods/variables from base class, unless they are overridden
     * If a class has a parameterized constructor, it has to define a blank default constructor in case it has to be inherited by some other class.
     * Base Class default Constructor is always called when you create an object of sub class
     */
    
    
    
    
  	
  }
}


class Animal
{
  int no_of_legs;
  boolean hasWings;
  boolean isHairy;
  boolean hasHorns;
  int x=10;
  
  Animal(int legs, boolean hasWings, boolean hairy, boolean horns)
  {
    no_of_legs=legs;
    this.hasWings=hasWings;
    isHairy=hairy;
    hasHorns=horns;
  }
  Animal()
  {System.out.println("Printing from Animal");}
  
  public int getSpeed()
  {
    
    return(no_of_legs*10);
  }

}


class Bird extends Animal
{

  int sizeOfWings;
  
  
  
  Bird(int wingSize)
  {
    no_of_legs = 2;
    hasWings=true;
    isHairy=false;
    hasHorns=false;
  
    sizeOfWings=wingSize;
    
  }
  
  public int getSpeed()
  {
    return(sizeOfWings*10);
  }


}

class Mammal extends Animal
{
  Mammal(boolean isHairy,boolean hasHorns)
  {
    no_of_legs=4;
    hasWings=false;
	this.isHairy=isHairy;
    this.hasHorns=hasHorns;
    int y=10;

  }
  public int getSp()
  {
    System.out.println("Printing from Mammal");
    return(no_of_legs*10);
  }
}