
public class Utilisateur extends Personne{

private String login ;
private String password ; 

public Utilisateur  (int id , String nomComplet , int salaire , String login , String password) { 
	super ( id , nomComplet , salaire ) ; 
	this.login = login ; 
	this.password = password ; 
	
}
public Utilisateur () {} 
Utilisateur ( Utilisateur u) { 
	login = u.login ; 
	password = u.password ; 
}


public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


public String afficheUtilisateur () { 
	return "Personne : id : " +super.getId() +"Nom : " +super.getNomComplet() + "Salaire : " +super.getSalaire()+ " login  : " +this.login ; 
}
}
