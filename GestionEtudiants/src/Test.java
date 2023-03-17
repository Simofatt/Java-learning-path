import java.util.Scanner ; 
public class Test {
	public static void main (String[]  Args) {
		Etuditant e1 = new Etuditant()    ; 
		Etuditant e2 = new Etuditant( "Simo" ) ; 
		Etuditant e3= new Etuditant(6341 , "Simo" , "Fatehi" ) ;
	
		
		 
	
		Scanner keyboardInput = new Scanner (System.in) ; 
		
		System.out.println ("Entrer les infos manquantes :  \n" + "code :  " ) ; 
		 e1.SetCode(keyboardInput.nextInt()); 
		 
			System.out.print(" Nom : ") ; 
			e1.SetNom( keyboardInput.next()) ; 
			
			System.out.print("prenom : ") ; 
			e1.SetPrenom(keyboardInput.next()) ;
			
			
			System.out.println(" Entrer les infos manquantes pour le 2eme etudiant  ") ; 
			System.out.print(" Code  : ") ; 
			e2.SetCode(  keyboardInput.nextInt());
		 
			System.out.println(" Prenom : ") ; 
			e2.SetPrenom(  keyboardInput.next());
			
		
			
			
			
			
		 
			System.out.println (e1.GetNom() ) ; 
			System.out.println (e1.GetPrenom() ) ; 
			System.out.println (e1.GetCode() ) ; 
			
			System.out.println (e2.GetNom() ) ; 
			System.out.println (e2.GetPrenom() ) ; 
			System.out.println (e2.GetCode() ) ; 
			
			System.out.println (e3.GetNom() ) ; 
			System.out.println (e3.GetPrenom() ) ; 
			System.out.println (e3.GetCode() ) ; 
			
			
			
	}

	
}
