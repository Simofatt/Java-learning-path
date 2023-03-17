
public class Etuditant {
	private int code ; 
    private String nom ; 
	private String prenom ; 
public Etuditant() {}

public Etuditant( String nom) { 
	this.nom = nom ; 	
}



public Etuditant (int code , String nom , String prenom ) { 
	this.code= code ; 
	this.nom = nom ; 
	this.prenom = prenom ; 
}
public Etuditant (Etuditant m) { 
	this.nom = m.nom ; 
	this.prenom=m.nom ;  
	this.code = m.code; 
	}


public String  toString() { 
	 return "L'etudiant dont le code est : " +this.code +
	 "Son nom est " +this.nom+ 
	  "Son prenom est " +this.prenom ;  
}
	
public void SetNom (String nom) { 	
	this.nom = nom; 
}

public String GetNom() { 
	return nom ;  
	}
public void SetPrenom ( String prenom) { 	
	this.prenom = prenom ; 
}

public String GetPrenom() { 
	return prenom ;  
	}
public void SetCode (int code) { 	
	 
	this.code = code ; 
}

public int GetCode() { 
	return code ;  
	}



}


