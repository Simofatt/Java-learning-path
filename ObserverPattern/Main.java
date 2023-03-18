package ObserverPattern;

public class Main {

	public static void main (String [] args ) { 
		 
		ObservableImp observable = new ObservableImp(); 
		Observer o1 = new ObserverImp1() ; 
		Observer o2 = new ObserverImp1() ; 
		Observer o3 = new ObserverImp2() ;
		
		observable.addObserver(o1) ; 
		observable.addObserver(o3) ; 
		observable.setState(10); 
		
	}
}
