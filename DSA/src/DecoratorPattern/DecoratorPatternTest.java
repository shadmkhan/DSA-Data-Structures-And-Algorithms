package DecoratorPattern;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Beverage b1 = new Mocha(new Soy(new Soy(new PlainCoffee())));
		
		System.out.println(b1.getDescription());
		
		System.out.println("Cost : " + b1.getCost());
		
		System.out.println();
		Beverage b2 = new Mocha(new Soy(new Soy(new Espresso())));
		
		System.out.println(b2.getDescription());
		System.out.println("Cost : " + b2.getCost());
	}

}
