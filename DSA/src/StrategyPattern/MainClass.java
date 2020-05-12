package StrategyPattern;

public class MainClass {
	public static void main(String[] args) {
		//Creating a new instance of Dog
		Animal d = new Dog();
		
		d.setName("Spark");
		d.reproduce();
		
		//Creating a new instance of Penguin
		d = new Penguin();
		d.reproduce();
	}

}
