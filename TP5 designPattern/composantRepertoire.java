package TP5;

public abstract  class composantRepertoire {
	
	String nom ; 
	int niveau ; 
	
	public composantRepertoire (String nom) { 
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
