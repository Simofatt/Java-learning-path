package Composite;

public abstract class ComposantMenu {

	String nom ; 
	int niveau ; 
	
	public ComposantMenu(String nom ) { 
		this.nom = nom ; 
	}
	
	public String indentation () { 
		String s = "" ; 
		for (int i=0 ; i<niveau ;i++) { 
			s += "\t" ; 
		}
		return s;
	}
	
	protected abstract void afficher();
	
}
