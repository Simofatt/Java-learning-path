package TP5;

import java.util.ArrayList;

import Composite.ComposantMenu;

public class repertoire extends composantRepertoire {
	
	ArrayList<composantRepertoire> composants = new ArrayList<> () ; 

	public repertoire(String nom) {
		super(nom);	
	}
	
public void  addComposants(composantRepertoire rep) { 
	rep.niveau = this.niveau +1 ; 
	composants.add(rep) ; 
	
}

public void afficher () { 
	 String tab = indentation();
     System.out.println(tab +  nom );
	for (composantRepertoire c : composants) { 
		c.afficher() ; 
	}
}
	
}
