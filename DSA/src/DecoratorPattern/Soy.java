package DecoratorPattern;

public class Soy extends CondimentDecorator 
{

	public Soy(Beverage bv) {
		super(bv);
		//System.out.println(getDescription());
	}

	@Override
	public String getDescription() {
		
		return currBeverage.getDescription()+ " + Soy";
	}

	@Override
	public double getCost() {
		
		return currBeverage.getCost()+1.5;
	}

}
