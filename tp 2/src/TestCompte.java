
public class TestCompte {

	public static void main (String[] args ) { 
		compte numero1 = new compte ("Simo") ; 
		compte numero2= new compte ("Fatehi") ; 
		
		 numero1.deposer(500);
		 numero2.deposer(1000);
		 
		 numero2.retirer(10);
		 numero1.virerVers(10 , numero2);
		 
		 numero1.afficher(); 
		 numero2.afficher() ; 		 
	}
}
