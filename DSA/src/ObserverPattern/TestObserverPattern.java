package ObserverPattern;

public class TestObserverPattern {

	public static void main(String[] args) {
		//WeatherCenter
		WeatherMumbai w = new WeatherMumbai();
		
		//Subscribers
		Subscriber[] subs = new Subscriber[3];
		for (int i = 0; i < subs.length; i++) {
			subs[i]=new Subscriber();
		}
		
		//Register all subscribers
		for(Subscriber sub:subs)
		{			
			w.registerSubscriber(sub);
		}
		w.setTemperature(30);
		w.setHumidity(75);
		
		//Print values from all subscribers
		for(Subscriber sub:subs)
			sub.print();
		
		System.out.println();
		
		//Unregister the second subscriber
		w.unregisterSubscriber(subs[1]);
		
		//Change the temperature and humidity in Weather center
		w.setTemperature(20);
		w.setHumidity(40);
		
		//Print values from all subscribers
		for(Subscriber sub:subs)
			sub.print();
	}
	
	
}
