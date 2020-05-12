package DecoratorPattern;

public abstract class CondimentDecorator implements Beverage{
	
	Beverage currBeverage;
	
	public CondimentDecorator(Beverage bv) {
		this.currBeverage=bv;
	}
	public String getDescription()
	{
		return currBeverage.getDescription();
	}
	public double getCost()
	{
		return currBeverage.getCost();
	}
	
	

}
