import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	static ArrayList<Etudiant> etudiants = new ArrayList<>() ; 
	
	 public static  void ajouterEtudiant() { 
	
  

	Etudiant etudiant1 = new Etudiant (1 ,"mohamed" , "Fatehi ") ; 
	Etudiant etudiant2 = new Etudiant ("mohamed" ) ; 
	Etudiant etudiant3 = new Etudiant () ; 
	Etudiant etudiant4 = new Etudiant (etudiant1) ; 
	
	
	//Par defaut 
	Scanner keyboardInput = new Scanner ( System.in ) ; 
	System.out.print("ENTRER VOTRE NOM :   ");
	etudiant3.setNom (keyboardInput.nextLine()) ; 
	System.out.print("ENTRER VOTRE PRENOM :   ");
	etudiant3.setPrenom (keyboardInput.nextLine()) ; 
	System.out.print("ENTRER VOTRE CODE :   ");
	etudiant3.setCode (keyboardInput.nextInt()) ; 
	
	
	
	
	//QUE LE NOM : 
	System.out.print("ENTRER VOTRE NOM :   ");
	etudiant2.setNom (keyboardInput.next()) ; 
	System.out.print("ENTRER VOTRE PRENOM :   ");
	etudiant2.setPrenom (keyboardInput.next()) ; 
	System.out.print("ENTRER VOTRE CODE :   ");
	etudiant2.setCode (keyboardInput.nextInt()) ; 
	
	
	
	etudiants.add(etudiant1) ; 
	etudiants.add(etudiant2) ; 
	etudiants.add(etudiant3) ; 
	etudiants.add(etudiant4) ; 
	
	 }
	 
	 
	public static  void afficher()
	{ 
		for ( int i=0 ; i<etudiants.size() ; i++ ) { 
			System.out.println(etudiants.get(i).toString());
			
		}
	}
		public static void main (String [] args ) { 
			ajouterEtudiant () ; 
			afficher() ; 
	}
}
