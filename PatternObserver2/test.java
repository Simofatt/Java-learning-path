package PatternObserver2;

public class test {

	public static void main(String [] args) { 
		
		stackGrabber stackgrabber = new stackGrabber() ; 
		
		stackObserver ob1 = new stackObserver(stackgrabber) ; 
		stackObserver ob2 = new stackObserver(stackgrabber) ; 
		stackObserver ob3 = new stackObserver(stackgrabber) ; 
		
		stackgrabber.setAapPrice(700);
		stackgrabber.setGoogPrice(700);
		stackgrabber.setIbmPrice(700);
		
	
		stackgrabber.setAapPrice(500);
		stackgrabber.setGoogPrice(500);
		stackgrabber.setIbmPrice(500);
		
		
	

		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		
		//en gros ob1 et ob2 dependent dun seul objet stackgrabber, lors de leur creation il sont ajouter a la liste observes pour 
		//quand une update est faite, on leurs notify cette update.
		//si on remove ob2 par exemple de la liste des observers, il ne sera pas notifie du changement fait 
		
		stackgrabber.removeObserver(ob2);
		//changement dans le stack
		stackgrabber.setAapPrice(900);
		stackgrabber.setGoogPrice(900);
		stackgrabber.setIbmPrice(900);
		
		//ob1 a ete notife du changement, mais pas ob2 . 
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		
	}
}
