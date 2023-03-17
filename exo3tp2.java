package ma.ac.ensate.compte;

import java.util.Scanner;

public class exo3tp2 {
	public static void main ( String [ ] args ) { 

		Scanner KeyboardInput = new Scanner(System.in ) ; 
	    System.out.println("entrer une chaine de caractere : ") ;
		String chaine = KeyboardInput.nextLine() ; 	
		
		
	
		
		
	System.out.println(chaine.replace('a' , 'b'));
		
		
		

	}
	public static String  tochar( String phrase , char char1 , char char2  ) { 
		return  phrase.replace(char2 , char1 ) ; 
	}
	
}


