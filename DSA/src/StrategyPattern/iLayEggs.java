package StrategyPattern;

public interface iLayEggs {	
	int noOfEggs(int n);

}

class CanLayEggs implements iLayEggs
{
	public int noOfEggs(int n) {
		return (n);
	}
	
}

class CannotLayEggs implements iLayEggs

{
	public int noOfEggs(int n) {
		return (0);
		
	}
	
}