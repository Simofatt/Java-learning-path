
public class Produit {
private int id ; 

public Produit (int id ) { 
	this.id = id ; 
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String imprimer() { 
	return "Produit : [ID" +this.id +"]"; 
}
}
