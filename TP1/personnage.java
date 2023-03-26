package TP1;

public class personnage {

	public comportementArme arme ; 
	public personnage() {} ; 
	
	public void setPersonnage(comportementArme arme) { 
		this.arme =arme ; 	
	}
	
	public void combattre() {  
	arme.utiliserArme() ; 
	}
	
	public void sound() { 
		System.out.println("Spaartaa");
		
	
}}
