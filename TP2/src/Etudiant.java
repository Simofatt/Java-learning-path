

public class Etudiant {
	
	int code ; 
	String nom ; 
	String prenom ; 
	
	
	public Etudiant (String nom ) {
		this.nom  = nom ; 
	}
	
	public Etudiant ( int code , String nom , String prenom ) { 
		this.nom = nom ; 
		this.prenom =  prenom ; 
		this.code = code ; 
	}

	public Etudiant () {}  ; 
	
	public Etudiant (Etudiant c ) { 
		this.nom = c.nom ;  
		this.prenom =  c.prenom ; 
		this.code = c.code ; 
	}

	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
