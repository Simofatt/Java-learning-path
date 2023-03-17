package EXO5;


import java.util.Scanner;

public class exo5 {
	public static void main ( String[] args ) { 
		Scanner keyboardInput = new Scanner( System.in ) ; 
	    System.out.println("Entrer une phrase  : ") ;
	    String chaine = keyboardInput.nextLine() ; 
	   int nbre_char= 0 ; 
	    
	    for ( int i=0 ;i <chaine.length() ; i++) { 
	    	if (chaine.charAt(i) != ' ') { 
	    		nbre_char++ ; 
	    	}
		    
	    }
	   
	    int nbre_mot = 0   ; 
	    for ( int i=0 ; i <chaine.length() ; i++) { 
	    	if (chaine.charAt(i) == ' ') { 
	    	nbre_mot ++;
	    	}
	    	
	    }
	    System.out.println(nbre_char) ;
	    System.out.println(nbre_mot) ;
	    
	    System.out.println(count(chaine)) ;
	    
	    
	    	
	    
	    
	}
	
	 public static int count(String word) {
		    if (word == null || word.isEmpty()) {
		      return 0;
		    }

		    int wordCount = 0;

		    boolean isWord = false;
		    int endOfLine = word.length() - 1;
		    char[] characters = word.toCharArray();

		    for (int i = 0; i < characters.length; i++) {

		      // if the char is a letter, word = true.
		      if (Character.isLetter(characters[i]) && i != endOfLine) {
		        isWord = true;

		        // if char isn't a letter and there have been letters before,
		        // counter goes up.
		      } else if (!Character.isLetter(characters[i]) && isWord) {
		        wordCount++;
		        isWord = false;

		        // last word of String; if it doesn't end with a non letter, it
		        // wouldn't count without this.
		      } else if (Character.isLetter(characters[i]) && i == endOfLine) {
		        wordCount++;
		      }
		    }

		    return wordCount;
		  }
}
