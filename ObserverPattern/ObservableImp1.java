package ObserverPattern;

public class ObservableImp1 implements Observer{
	private int etat ; 

	@Override
	public void update(Observable obs) {
		etat = ((ObservableImp)observable).getState() ; 
	System.out.println("******OBSERVER IMP1") ; 
	System.out.println((etat%2==0)?"pair","impaire") ; 
		
	}

	
	

}
