package TP5;

public class fichier extends composantRepertoire {
	
	public fichier (String nom) {
		super(nom) ;  
	}

	@Override
	protected void afficher() {
	System.out.println("le fichier " +nom) ; 	
	}
	

}
      