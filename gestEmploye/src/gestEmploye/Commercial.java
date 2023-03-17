package gestEmploye;


public class Commercial extends employe{
	 
	 
    int nbreVente ; 
	public Commercial (String nom , String matricule , double indiceSalarial , int nbreVente) { 
		super(nom , matricule , indiceSalarial ) ; 
		this.nbreVente = nbreVente ; 
	}
	

	

	public void  setNbreVente( int nbreVente ) { 
		this.nbreVente = nbreVente ; 
	   
	}
	
	public double salaireCommercial() {
		
		employe.salaire = employe.salaire*getIndiceSalarial()+this.nbreVente/10 ; 
		return employe.salaire ; 
		
	}
	public String afficher() {
		return super.afficher()+"Commercial [  salaire=" +salaireCommercial() + ", nbreVente=" + nbreVente + "]" ;
	}
	
	   
}

