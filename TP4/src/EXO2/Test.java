package EXO2 ; 
public class Test {
	
	
	
	
	
	
	
	
	
	public static void main ( String [] args ) { 
		CD cd1 = new CD (1 , "Premier pas " , "Coolen Hover" , "isbn" , 500) ; 
		Livre livre1 = new Livre (2 , "Premier pas " , "Coolen Hover" , "isbn" ) ; 
		System.out.println(cd1.imprimer());
		System.out.println(livre1.imprimer());
		
		
		Produit prd1 = cd1 ;  
		System.out.println(prd1.imprimer());
		
		Produit prd2 = livre1 ;
		System.out.println(prd2.imprimer());
		
		//Dans cette exo on peut remarque quand premier lieu on a pu creer un objet cd1 et livre1 a partir de la classe Livre et CD 
		//DANS UNE DEUXIEME LIEU ON A CREER UN OBJET PRD1 ET PRD2 QUI SONT DES OBJECT DE LA CLASSE CD ET LIVRE A PARTIR DU LA CLASSE PRODUIT 
		//CAR C'EST UNE CLASSE MERE, LES AUTRES SONT DES CLASSES FILS 
		// LE PRODUIT prd1 C'EST UN CD ou UN LIVRE .
		
		
		
	}

}
