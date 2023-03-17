package EXO2; 
public class CD extends Livre  { 
	private String titre ; 
	private String auteur ;
	private int prix ;

	public CD(int id, String titre, String auteur, String isbn ,   int prix ) {
		super(id, titre, auteur, isbn);
		this.titre = titre ;
		this.auteur = auteur ; 
		this.prix = prix ; 
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	} 
	
public  String imprimer()  { 
	return "livre [ ID : " +super.getId()+ " titre" +super.getTitre()+ " de  : " +super.getAuteur()+ " pour un prix exeptionnel de : " +this.prix+"MAD" ; 
}

}