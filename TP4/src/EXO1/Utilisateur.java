package EXO1;

public class Utilisateur extends personne {
	String login ; 
	String password ; 
	 
	public Utilisateur (int id , String nomComplet , int salaire , String login , String password ) { 
		super(id , nomComplet , salaire ) ; 
		this.login = login ; 
		this.password = password ; 
		
	}
	public Utilisateur ( ) {} ; 
	public Utilisateur (Utilisateur c) { 
		super(c.id ,c.nomComplet , c.salaire ) ; 
		this.login = c.login ; 
		this.password = c.password ; 
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
	public String afficheUtilisateur() {
		return super.toString() +" Utilisateur [login=" + login + ", password=" + password + "]";
	}

}
