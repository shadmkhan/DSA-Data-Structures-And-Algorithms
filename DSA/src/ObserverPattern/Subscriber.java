package ObserverPattern;

public class Subscriber implements Observer {

	
	int temperature; int humidity;
	
	@Override
	public void update(int temperature, int humidity) {
		this.temperature=temperature;
		this.humidity=humidity;
	}
	
	
	public void print()
	{
		System.out.println("Temperature : " + temperature);
		System.out.println("Humidity : " + humidity);
	}
	

}
