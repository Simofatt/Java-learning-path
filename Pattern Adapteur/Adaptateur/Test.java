package Adaptateur;

public class Test {
public static void main (String[] args ) { 
	client c1 = new client() ; 
	c1.setStandard(new Imp2());
	c1.process(5,4) ;
	
	c1.setStandard(new adapteur());
	c1.process(5,4) ;
	
	
	
}
}
