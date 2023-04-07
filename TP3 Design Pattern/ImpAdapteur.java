package TP3;

public class ImpAdapteur  {
	String name ; 
	String poste ; 
	
	
	public void afficherName(String name ) {
		this.name = name; 
		System.out.println("le Nom est :"+ this.name);
	}
	
	public void afficherPoste(String poste) {
		this.poste = poste ; 
		System.out.println("Son poste est :"+ poste);
	}
	
	

}
