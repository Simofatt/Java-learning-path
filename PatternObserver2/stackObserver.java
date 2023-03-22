package PatternObserver2;

public class stackObserver implements Observer {

	private double ibmPrice ; 
	private double googPrice; 
	private double aaplPrice; 
	int ObserverID; 
	int ObserverIdTracker = 0 ; 
	private Subject stackGrabber ; 
	
	
	public stackObserver (Subject stackGrabber) {
		this.stackGrabber = stackGrabber ; 
		stackGrabber.addObserver(this) ; 
		
		
	}



	public void update(double ibmPrice, double googPrice, double aaplPrice) {
		this.ibmPrice = ibmPrice; 
		this.googPrice = googPrice; 
		this.aaplPrice = aaplPrice; 
		
	}



	public String toString() {
		return "stackObserver [ibmPrice=" + ibmPrice + ", googPrice=" + googPrice + ", aaplPrice=" + aaplPrice
				+ ", ObserverID=" + ObserverID + "]";
	}


	
	
	
	

	
}
