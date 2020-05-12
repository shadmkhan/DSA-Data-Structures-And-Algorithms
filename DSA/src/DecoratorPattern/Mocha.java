package DecoratorPattern;

public class Mocha extends CondimentDecorator

{

	public Mocha(Beverage bv) {
		super(bv);
		//System.out.println(getDescription());
	}

	@Override
	public String getDescription() {
		return currBeverage.getDescription()+ " + Mocha";
	}

	@Override
	public double getCost() {

		return currBeverage.getCost()+0.5;
	}

}
