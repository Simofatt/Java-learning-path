package TP3;

public class Adapteur extends ImpAdapteur  implements Utilisateur {
	String name ; 
	String poste ; 
	

	
	public Adapteur (String name , String poste) {
		this.name = name ; 
		this.poste = poste;
	} 

	@Override
	public void afficherUser(String name , String poste) {
		super.afficherPoste(this.poste); 
		super.afficherName(this.name); 
		
		
		
		
		
	}

}