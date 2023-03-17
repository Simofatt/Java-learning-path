package EXO2 ; 
public class Livre extends Produit  {

	private String titre ; 
	private String  auteur ; 
	private String isbn ;  
	
	public Livre (int id , String titre , String auteur , String isbn ) { 
		super ( id ) ; 
		
		this.titre = titre ; 
		this.auteur = auteur ; 
		this.isbn = isbn ; 
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String imprimer() { 
		return "livre [ ID : " +super.getId()+ " titre" +this.titre+ " de  : " +this.auteur+ " (ISBN : " +this.isbn+ ")"	 ;
		}
}
