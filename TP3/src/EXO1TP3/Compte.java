package EXO1TP3;

public class Compte {

	public int noCompte ;
	public String titulaire ; 
	private int solde ; 
	
	
	public Compte () {} ; 
	public Compte (int noCompte , String titulaire  , int solde ) { 
		this.noCompte = noCompte ;
		this.titulaire = titulaire ; 
		this.solde = solde ; 
	}
	
	
	
	public int getNoCompte() {
		return noCompte;
	}
	public void setNoCompte(int noCompte) {
		this.noCompte = noCompte;
	}
	public String getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}
	public int  getSolde() {
		return solde;
	}
	public void setSolde(int  solde) {
		this.solde = solde;
	}
	public String toString() {
		return "Compte [noCompte=" + noCompte + ", titulaire=" + titulaire + ", solde=" + solde + 
				"]" ; 
	}
	
	
	
}


