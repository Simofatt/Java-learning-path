
package TP3;

import java.util.ArrayList;

public class Application {
	String name ; 
	String poste ; 
     Utilisateur user ; 
 ArrayList<Utilisateur> users =new ArrayList<Utilisateur> ()   ;
    
 
    public void process () { 
  
    	for (Utilisateur u : users ) { 
    		u.afficherUser(this.name,this.poste) ;  
    		
    	}
	
    }
	
	public void setUser(Utilisateur user) {
		this.user = user;
	     addUsers(user) ; 
	     }

	public void addUsers(Utilisateur user) {
		  users.add(user) ; 
	}
}