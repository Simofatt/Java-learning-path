package EXO2TP2;

import java.util.ArrayList;

public class Test {
	
	public static void main (String[] args ) { 
		
		ArrayList<Compte > comptes = new ArrayList<> () ; 
Compte compte1 = new Compte ("Mohamed") ; 
Compte compte2 = new Compte ("Ali") ;
Compte compte3 = new Compte () ;

comptes.add(compte1) ; 
comptes.add(compte2) ; 
comptes.add(compte3) ; 
 

compte1.deposer(500); 
compte2.deposer(1000); 
compte2.retirer(500); 
compte1.virerVers(compte1,75);
 
compte1.retirer(200500);
compte3.deposer(500);


for ( int i=0 ; i< comptes.size() ; i++ ) { 
	
	System.out.println(comptes.get(i).toString());
	
}





}
}
