package EXO2;

public class carre  extends Forme{
	double cote ; 
	
	public carre(double cote ) { 
		this.cote = cote ; 
	}

	
	public double getSurface() { 
		return this.cote*cote ; 

	
	}


	@Override
	public String toString() {
		return "carre [cote=" + cote + "]";
	}
	
	
}

