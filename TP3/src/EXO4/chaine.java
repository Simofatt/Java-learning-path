package EXO4;

import java.util.Scanner;

public class chaine {

	
	public static void main (String  [] args) {

	char char1 = 'a'; 
	char char2 = 'b' ; 
	String phrase ; 
	
	Scanner keyboardInput = new Scanner(System.in) ; 
	 System.out.println("entrer une chaine de caractere : ") ;
	phrase = keyboardInput.nextLine() ; 
	int occ = phrase.indexOf(char1) ; 
	System.out.println(occ) ; 
	
	
	System.out.println(phrase.replace(char1, char2) )  ;
	}


	
}

