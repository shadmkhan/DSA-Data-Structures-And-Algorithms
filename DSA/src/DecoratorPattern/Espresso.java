package DecoratorPattern;

public class Espresso implements Beverage 
{

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public double getCost() {
		return 15;
	}
	

}
