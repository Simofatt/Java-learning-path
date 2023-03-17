package EXO1TP3;
	
	import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
	
	public class Test {
	
		 static ArrayList<Compte> comptes = new ArrayList<> () ; 
		
		public static void ajouterComptes () { 
			Scanner keyboardInput = new Scanner ( System.in) ; 
			System.out.print("Combien de compte a ajouter : "); 
			int nbreCompte = keyboardInput.nextInt() ;
			for ( int  i =0 ; i<nbreCompte; i++ ) { 
			try {  
				System.out.print("noCompte : ");
			    int noCompte = keyboardInput.nextInt() ; 
				System.out.print("Nom du titulaire  : ");
			    String nom  = keyboardInput.next() ; 
				System.out.print("Solde  : ");
				int solde = keyboardInput.nextInt() ; 
				
				
				Compte compte = new Compte(noCompte , nom , solde ) ; 
				comptes.add(compte ) ; 
			}   catch (InputMismatchException e) {
				  // code to handle the InputMismatchException
				  System.out.println("Invalid input. Please enter a valid integer for the account number.");
				} catch (NumberFormatException e) {
				  // code to handle the NumberFormatException
				  System.out.println("Invalid input. Please enter a valid name for the account holder.");
				}
			}
			
			keyboardInput.close();
			
		}
	
public  static void afficher () { 
	for ( int  i =0 ; i<comptes.size() ; i++ ) { 
		System.out.println (comptes.get(i).toString() ) ; 
	}
	   
}
public static void afficher2() { 
	for ( int i=0 ; i<comptes.size() ; i++ ) { 
		if (comptes.get(i).getSolde() >9000) {
			System.out.println (comptes.get(i).toString() ) ; 
		}
		
	}
}
	public static void main (String [] args ) { 
		Scanner keyboardInput = new Scanner ( System.in) ; 
		
		boolean isTrue = true ; 
		while (isTrue = true ) { 
		System.out.print("a.	Ajouter un tableau de comptes\r\n"
				+ "b.	Afficher tous les comptes\r\n"
				+ "c.	Afficher les comptes qui ont un montant >= 9000\r\n"
				+ "d.	Quitter le programme\r\n"
				+ "");
		String num = keyboardInput.nextLine() ; 
	
	 switch(num) {   
	case "a" :
		ajouterComptes() ; 	
		break ; 
	case "b" : 
		afficher() ; 
		break ; 
	case "c" : 
		afficher2() ; 
	case "d" : 
		System.exit(0) ; 
	 isTrue =false  ;
		
	 }
		
	 
	}
	}
}
