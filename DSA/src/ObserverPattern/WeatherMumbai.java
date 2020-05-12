package ObserverPattern;

import java.util.ArrayList;

public class WeatherMumbai implements Subject 
{
	ArrayList<Observer> arrObservers = new ArrayList<>();
	private int temperature;
	private int humidity;

	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifySubscribers();
	}
	
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifySubscribers();
		
	}
	
	
	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(Observer o:arrObservers)
		{
			o.update(temperature, humidity);
		}
	}

	@Override
	public void registerSubscriber(Observer newObserver) {
		
		arrObservers.add(newObserver);
		//System.out.println("Added successfully");
	}

	@Override
	public void unregisterSubscriber(Observer delObserver) {
		arrObservers.remove(arrObservers.indexOf(delObserver));
		//System.out.println("Removed successfully");
		
	}
	

}
