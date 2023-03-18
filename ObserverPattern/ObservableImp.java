package ObserverPattern;

import java.util.ArrayList;

public class ObservableImp implements Observable {
ArrayList<Observer> observers = new ArrayList<Observer>() ; 
	@Override
	public void addObserver(Observer observer) {
	
		observers.add(observer); 
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer) ; 
		
	}

	@Override
	public void notifyObserver() {
		
		for ( Observer o : observers ) { 
			o.update(this) ; 
		}
	}

}
