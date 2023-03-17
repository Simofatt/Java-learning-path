package EXO1;

public class personne {
	int id ; 
	String nomComplet ; 
	int salaire ; 
	public personne (int id , String nomComplet , int salaire ) { 
		this.id  = id ; 
		this.nomComplet = nomComplet ; 
		this.salaire = salaire ;
		
		
		
	}
	public personne () {} ; 
	public personne (int id , String nomComplet ) { 
		this.id  = id ; 
		this.nomComplet = nomComplet ; 
	}
	public personne (personne c ) { 
		this.id  = c.id ; 
		this.nomComplet = c.nomComplet ; 
		this.salaire = c.salaire ;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public String toString() {
		return "personne [id=" + id + ", nomComplet=" + nomComplet + ", salaire=" + salaire + "]";
	}

	
}
