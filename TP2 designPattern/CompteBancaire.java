package TP2;

public class CompteBancaire {
	private int numero ; 
	private double solde ;
	


	public  CompteBancaire(int numero , double solde ) {
		this.numero = numero ; 
		this.solde = solde; 
}


	public void deposerArgent( double montant ) { 
		if(montant>=0 ) { 
			
		
		this.solde += montant ; 
		journalisation.getInstance().ajouterLog("le montant a ete deposer !") ; 
		}else { 
		journalisation.getInstance().ajouterLog("Le montant doit etre positif") ; 
		}
		//journalisation.getInstance();
	
			
	}
	
	public void retirerArgent(double montant ) { 
	
		if(montant >=0) { 
			if(montant<=solde) { 
				journalisation.getInstance().ajouterLog("Le montant a bien ete retirer ");
				this.solde -= montant ; 
			}else{ 
				journalisation.getInstance().ajouterLog("SOLDE INSUFFISANT") ; 
			}
		}else { 
			journalisation.getInstance().ajouterLog("Le montant doit etre positif") ; 
	}
	}
	
	
	
	
	public String toString() {
		return "CompteBancaire [numero=" + numero + ", solde=" + solde + "]";
	}
	
	
}


 
