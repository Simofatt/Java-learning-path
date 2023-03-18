package Composite;

public class test {

		public static void main(String[] args) {
		Menu root = new Menu("restaurant AMG");
		
		Menu M1 = new Menu ("Pizza");
		Menu M2 = new Menu ("Chawarma"); 
		Menu M3 = new Menu ("sandwich");
		
		Plat p1 =new Plat ("pizza fruit de mer", 40);
		Plat p2 =new Plat ("pizza 4 fromage", 20); 
		Plat p3 =new Plat ("chawarma poulet", 25); 
		Plat p4 =new Plat ("chawarma mixte", 30);
	    Plat p5 =new Plat ("sandwich thon", 15);
		Plat p6 =new Plat ("sandwich poulet", 22);
		
	    root.addComposant (M1);
		root.addComposant (M2);
		root.addComposant (M3); 
		M1.addComposant (p1);
		M1.addComposant (p2);
		M2.addComposant (p3);
		M2.addComposant (p4);
		M3.addComposant (p5);
		M3.addComposant (p6);
		root.afficher ();
		}
}
