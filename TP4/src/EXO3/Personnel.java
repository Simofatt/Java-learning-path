package EXO3;

import java.util.ArrayList;

public class Personnel {
	public ArrayList<employe> employes ;
	public ArrayList<commerciaux> comm ; 
	private double salaireAverser = 0  ; 
	
	public Personnel (ArrayList<employe> employes , ArrayList<commerciaux> comm) { 
		this.employes = employes ; 
		this.comm = comm ; 
	}
	
	
	public double calculeSalaireAverser () { 
		for ( int i = 0 ; i<employes.size() ; i++ ) { 
		this.salaireAverser +=   employes.get(i).calculeSalaire() ; 
		}
		for( int i =0 ; i <comm.size() ; i++ ) { 
			  this.salaireAverser += comm.get(i).calculSalaireCommerciaux () ; 
		}
		return this.salaireAverser ; 
	}


	public void  afficher () { 
		for ( employe e : employes )
		{
			System.out.println(e.ToString()) ; 
			}
		for ( commerciaux c : comm) { 
			System.out.println(c.ToString()) ;
			
		}
	}
	

	
	
 
	
	
	
	

}
