package gestEmploye;

import java.util.ArrayList;
public class responsables  extends employe{ 

	public ArrayList<employe> employes ;
	
	
	public responsables (String nom , String matricule , double indiceSalarial , ArrayList<employe> employes ) { 
	super (nom , matricule , indiceSalarial ) ;
	this.employes = employes;  
	
}

    public ArrayList<employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<employe> employes) {
        this.employes = employes;
    }

    public void afficherEmployesDirects() {
        for (employe e : employes) {
            System.out.println(e.ToString());
        }
    }

  
    public void afficherEmployesIndirects() {
        for (employe e : employes) {
            if (e instanceof responsables) {
                responsables r = (responsables) e;
                r.afficherEmployesDirects();
            } else {
                System.out.println(e.ToString());
            }
        }
    }

@Override
public String toString() {
	return super.toString()  	;
	
}



}



/*public  String  imprimer() { 
	String [] result = new String [direct.length ] ; 
	for (int  i =0 ; i< this.direct.length ; i++ )  { 
		if (this.nom.equals(getNom())) { 
		result [i ] = direct [i] ; 
		
	}}
	return super.afficher() +Arrays.toString(result ) ;  
}
}*/
