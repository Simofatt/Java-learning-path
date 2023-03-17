package EXO3;

public class commerciaux  extends employe { 
	
	int nbreVente ;
	String typeVente ; 
	public commerciaux (String nom , String matricule , double indiceSalarial , int nbreVente , String typeVente) { 
		super (  nom ,  matricule ,  indiceSalarial) ; 
		this.nbreVente = nbreVente ; 
		this.typeVente = typeVente ; 
		
	}
	public int getNbreVente() {
		return nbreVente;
	}
	public void setNbreVente(int nbreVente) {
		this.nbreVente = nbreVente;
	}
	public String getTypeVente() {
		return typeVente;
	}
	public void setTypeVente(String typeVente) {
		this.typeVente = typeVente;
	}
	
	public double calculSalaireCommerciaux () { 
	   
		return  salaire*indiceSalarial + (double)nbreVente/10 ; 
	}
	
	public String toString () { 
		return "Le commercial : " +nom +"A fait : " +this.nbreVente +"VENTE " + "DE TYPE: " +this.typeVente+ "Son salaire est : "+ calculSalaireCommerciaux() ; 
	}
	
}
