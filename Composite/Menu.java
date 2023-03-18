package Composite;

import java.util.ArrayList;

public class Menu  extends ComposantMenu{
private ArrayList<ComposantMenu> composantMenu = new ArrayList<>() ; 
	
	
	
	public Menu(String nom) {
		super(nom);
		
	}
   
	public void addComposant(ComposantMenu c) { 
	c.niveau = this.niveau+1 ; 
	composantMenu.add(c) ; 
}

	public void afficher() { 
		String tab  = indentation() ; 
		System.out.println(tab +nom) ;
		for(ComposantMenu m : composantMenu) { 
			m.afficher() ; 
			
		}
 		
	}
}
