package TP5;

public class raccourcie  extends composantRepertoire{

	
	
	
	
	public raccourcie (String nom) {
		super(nom) ;  
	}

	@Override
	protected void afficher() {
	System.out.println("le fichier " +nom) ; 
		
	}
	

}
