
public class Personne {
	private int id ; 
	private String nomComplet ; 
	private double salaire ; 

	public Personne (int id , String nomComplet , int salaire ) { 
		this.id = id ; 
		this.nomComplet = nomComplet ; 
		this.salaire = salaire ; 
		
	}
	
	public Personne () {}  
	public Personne (int id , String nomComplet ) { 
		this.id = id ; 
		this.nomComplet = nomComplet ; 
	}
	Personne (Personne c ) { 
		id = c.id ; 
		nomComplet = c.nomComplet ; 
		salaire = c.salaire ; 
	}
	
	
	public int getId () { 
		return this.id ; 
	}
	public void setId(int id)  { 
		this.id = id ; 
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	public String affichePersonne() { 
		return "Personne [ id :"+ this.id + ";  Nom : " +this.nomComplet+"; Salaire :"+ this.salaire +"]" ; 
	}
	
	
}



