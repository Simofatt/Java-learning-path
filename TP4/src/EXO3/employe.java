package EXO3;



public class employe {
	public String nom ; 
	public String matricule ; 
	public  double indiceSalarial ; 
	public static double salaire =10000; 
	 
	
	public employe (String nom , String matricule , double indiceSalarial ) { 
		this.nom = nom ; 
		this.matricule = matricule ;
		this.indiceSalarial = indiceSalarial ; 
		
		
	
	}
	public  String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public double getIndiceSalarial() {
		return indiceSalarial;
	}

	public void setIndiceSalarial(double indiceSalarial) {
		this.indiceSalarial = indiceSalarial;
	}
	
	public  double calculeSalaire () { 
		
	return  indiceSalarial*salaire; 
		
	}
	public String ToString() {
		return "Le nom : " +this.nom+" Matricule : " +this.matricule+ " indiceSalarial :" +this.indiceSalarial +"et son salaire : "+calculeSalaire(); 
	}
	 

}
