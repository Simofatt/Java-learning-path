
public class compte {
int solde =  0 ; 
String nomTitulaire ;
	
public compte (String nomTitulaire) { 
		  this.nomTitulaire = nomTitulaire ; 
}



public void deposer (int montant ) { 
	solde = solde + montant ; 
 
}
public void retirer (int montant )  { 
	 if(solde  > montant ) { 
		 solde = solde - montant ; 
		 
	 }
	 
else { 
	System.out.println("Solde insuffisant "); 
}	
}
//La fct virerVers transfert le solde a retirer du montant vers le compte destinataire , elle doit avoir 2compte le 1ere du emeteur et le 2eme du destinataire 
public void virerVers (int montant , compte destination ) {
     this.retirer(montant); 
	 destination.deposer(montant) ; 
 
}
	 

public void afficher() { 
	System.out.println("Le nom du titulaire est : " +nomTitulaire);
	System.out.println("le solde est  : " +solde);
}
}
	
