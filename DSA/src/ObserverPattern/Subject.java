package ObserverPattern;

public interface Subject {
	void registerSubscriber(Observer newObserver);
	void unregisterSubscriber(Observer delObserver);
	void notifySubscribers();
}
