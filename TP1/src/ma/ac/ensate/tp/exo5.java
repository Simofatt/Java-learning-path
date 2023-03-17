package ma.ac.ensate.tp;
import java.util.Scanner ; 

public class exo5 {
	public static void main (String [] args )  { 
		
		Scanner keyboardInput = new Scanner (System.in) ; 
		System.out.print( "veuillez entrer le nombre de ligne :  "); 
		int nbr = keyboardInput.nextInt() ; 
		
		for (int  i= nbr ; i>=1 ; i--) { 
			for (int  j = 1 ; j <=i ; j++) { 
				System.out.print(" ");
				
			}
			for ( int k=nbr ; k >=i ; k--) { 
				System.out.print("+") ;
			}
			
		 for ( int l= nbr ; l>=i ; l--) { 
			  System.out.print("+");
		   }
			System.out.println(" ");
	}
	}

}
