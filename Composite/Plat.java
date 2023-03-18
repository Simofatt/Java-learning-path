package Composite;

public class Plat extends ComposantMenu {
	
	private int  prix ; 

	public Plat(String nom , int prix ) {
		super(nom);
		this.prix = prix ; 
		
	}

	public void afficher() { 
		System.out.println(nom + "le prix : " +prix) ;
	}
	
	
}
