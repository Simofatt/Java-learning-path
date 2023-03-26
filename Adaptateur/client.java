package Adaptateur;

public class client {
	private Standard standard ;
	public void process (int e1 , int e2 ) { 
		standard.operation(e1,e2) ; 
	}
	
	//pour changer le comportement, est ce quil va utiliser limp 1 ou 2 ou ...
	public void setStandard  (Standard standard)  {
		this.standard = standard ; 
		
	}

	public Standard getStandard() {
		return standard;
	}
	

	
}
