package EXO2;

public class rectangle extends Forme {
	
	double longueur ; 
	double largeur ; 

	public rectangle (double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
  public double getSurface() { 
	  return this.longueur*this.largeur ; 
  }
	@Override
	public String toString() {
		return "rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

}
