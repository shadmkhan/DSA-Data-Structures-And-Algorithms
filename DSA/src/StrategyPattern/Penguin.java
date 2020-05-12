package StrategyPattern;

//Penguin class extending Animal

public class Penguin extends Animal 
{
	public Penguin(){
		noOfLegs=4;
		canFly=false;
		laysEggs= new CanLayEggs();
		//Penguins can lay eggs, so we set the interface laysEggs to its implementing class CannotLayEggs
	}
	
	public void eat() {
		// Code to Eat
		
	}
	
	public void move() {
		// Code to move
		
	}
	
	public void reproduce() {

		System.out.println("Penguin lays " + laysEggs.noOfEggs(4) + " eggs");

	}

}
