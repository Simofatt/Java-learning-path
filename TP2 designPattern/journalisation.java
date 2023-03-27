package TP2;

public class journalisation {
	
String log =""; 

private static final journalisation Jcompte = new journalisation(); 


private journalisation() {} ; 


public void ajouterLog(String l ) { 
	log += l+"\n" ;  
}

public String getLog() { 
	return this.log ; 
}
public static journalisation getInstance() {
    return Jcompte;
}
}

