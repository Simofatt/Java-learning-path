package TP1;

public class test {

	public static void main (String [ ] args ) { 
		personnage pers1 = new Roi() ; 
		
		pers1.setPersonnage(new poignard());
		pers1.combattre();
		
		pers1.setPersonnage(new ArcEtFleche());
		pers1.combattre();
		
		
		pers1.sound();
	
		
	}
}
