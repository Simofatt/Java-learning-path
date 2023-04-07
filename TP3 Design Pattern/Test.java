package TP3;

public class Test {
public static void main(String[] args)  {
	
	
	Application app1 = new Application() ; 
	app1.setUser( new Adapteur("mohamed" , "Directeur")) ; 
	app1.process();
	
	app1.setUser(new GrandeDistribution("Ali"));
	app1.process();
	
	

	
}
	
}
