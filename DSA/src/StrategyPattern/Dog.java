package StrategyPattern;

//Dog class extending Animal
public class Dog extends Animal 
{
	public Dog(){
		noOfLegs=4;
		canFly=false;
		//Dogs cannot lay eggs, so we set the interface laysEggs to its implementing class CannotLayEggs
		laysEggs= new CannotLayEggs();
	}
	
	public void eat() {
		// Code to Eat
		
	}
	
	public void move() {
		// Code to move
		
	}
	
	public void reproduce() {
		System.out.println("Doggy lays " + laysEggs.noOfEggs(0)+ " eggs");
		
	}


}
