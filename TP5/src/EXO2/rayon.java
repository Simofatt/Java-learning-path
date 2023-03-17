package EXO2;

public class rayon extends Forme {
	
	double rayon ; 
	public rayon (double rayon) {
		this.rayon = rayon;
	}

	public double getSurface () { 
		return Math.PI*this.rayon*this.rayon ; 
	}

	@Override
	public String toString() {
		return "rayon [rayon=" + rayon + "]";
	}

	
}
