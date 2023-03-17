import java.util.Scanner;
public class GuessGame{
	public static void main (String[]  Args) { 
		Scanner keyboardInput = new Scanner (System.in);   
	
	    
	    String secretCode = "GJW9" ;
	    String guess = ""; 
	    int count = 0 ; 
	    int maxcount = 3 ; 
	    boolean papa = false ; 
	    
	     
	    while (!guess.equals(secretCode)&& !papa) { 
	    	
	    	if (count!=(maxcount)) { 
	    		System.out.print("enter le code : ") ;
	   	 	     guess = keyboardInput.nextLine() ; 
	   	 	     count++;	
		 	     } else if (count==(maxcount)) { 
		 	    	 papa = true ; 
	    	    	System.out.println("u lost") ;
	    	     }
	    	
	 	   
		  	
		    }
	   
	      if (guess.equals("GJW9")) { 
		    	System.out.println("u won  ") ;
		    	
		    	
	  
	   
	   
	   
	   
	   
	   
	   
	    }
	}
}