package EXO4TP2;

public class sexagesimale {
	int heures ; 
	int minutes ;
	int secondes;
	double dHeures ; 
	

	public sexagesimale (int heures , int minutes , int secondes ) { 
		this.heures = heures ; 
		this.minutes = minutes ; 
		this.secondes = secondes; 
		
	}
	public sexagesimale () {} ; 
	
	public sexagesimale ( double dHeures ) { 
		this.dHeures = dHeures ;
	}
	
	
	public  double  conversion1 (sexagesimale HMS) {
		this.dHeures=0 ; 
	    this.dHeures = (HMS.heures) + (HMS.minutes / 60.0) + (HMS.secondes / 3600.0);
	return this.dHeures ; 
	  
			
	}
	public sexagesimale conversion2 (sexagesimale Hour) {
		this.heures = 0 ; 
		this.minutes= 0 ; 
		this.secondes = 0 ; 
		this.heures = (int) Hour.dHeures;
	    this.minutes = (int) ((Hour.dHeures - this.heures) * 60);
		this.secondes = (int) ((((Hour.dHeures - this.heures) * 60) - this.minutes) * 60);
		return new sexagesimale (this.heures ,this.minutes ,this.secondes ); 
		
		
	} 
	
	
	
	
	
	
	@Override
	public String toString() {
		return "sexagesimale [heures=" + heures + ", minutes=" + minutes + ", secondes=" + secondes + ", dHeures="
				+ dHeures + "]";
	}
	public int getHeures() {
		return heures;
	}
	public void setHeures(int heures) {
		this.heures = heures;
	}
	public int getMinutes() {
		
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSecondes() {
		return secondes;
	}
	public void setSecondes(int secondes) {
		this.secondes = secondes;
	}
	public double getdHeures() {
		 
		
		return dHeures;
	}
	public void setdHeures(double dHeures) {
		this.dHeures = dHeures;
	}

	
	
}
