package PatternObserver2;

import java.util.ArrayList;

public class stackGrabber implements Subject {
	
	private double ibmPrice ; 
	private double googPrice; 
	private double aaplPrice; 
    private ArrayList<Observer> observers ; 
    
    public stackGrabber() {
    	observers = new ArrayList<Observer> (); 
    	
    }


	public void notifyObserver() {
		for(Observer ob: observers) { 
		ob.update(this.ibmPrice , this.googPrice, this.aaplPrice) ; 
		}
		
	}

	public void addObserver(Observer ob) {
		observers.add(ob) ; 
		
		
	}


	public void removeObserver(Observer ob) {
	   int indexOf =  observers.indexOf(ob) ; 
	   observers.remove(indexOf) ;
		
	}
	
	public void setIbmPrice(double ibmPrice) { 
		this.ibmPrice = ibmPrice ; 
	    notifyObserver();
		
	}
	
	public void setGoogPrice(double googPrice) { 
		this.googPrice = googPrice ; 
	    notifyObserver();
		
	}
	public void setAapPrice(double aaplPrice) { 
		this.aaplPrice = aaplPrice ; 
	    notifyObserver();
		
	}

}
