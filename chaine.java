package ma.ac.ensate.compte;

import java.util.Scanner;

public class chaine {
	public static void main ( String [ ] args ) { 

	Scanner KeyboardInput = new Scanner(System.in ) ; 
    System.out.println("entrer une chaine de caractere : ") ;
	String chaine = KeyboardInput.nextLine() ; 	
	int S=0 ; 
	
	for ( int i = 0 ; i<chaine.length() ; i++) {
	
		if ( chaine.charAt(i) != ' ') {
			
			S++ ; 
		}
		
		System.out.println( +S);
	
	}
	System.out.println(capitalize(chaine));

	
	
	
	

	
	
	
	}
	public static String capitalize(String Chaine) {
		return Chaine.substring(0,1).toUpperCase() +Chaine.substring(1) ; 
	}
}
