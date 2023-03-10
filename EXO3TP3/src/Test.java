
public class Test {
	 public static void main(String[] args) {
	        Etudiant e1 = new Etudiant(2, "Simo", "zakaria", 4);
	        Etudiant e2 = new Etudiant(3, "Ahmed", "Oussama", 2);
	        Filiere filiere = new Filiere(1, "Génie informatique");
	        try {
	            e1.updatePrenom("Mohamed");
	            filiere.addEtudiant(e2);
	            e1.getAllEtudiants();
	            filiere.getEtudiantByFiliere();
	            filiere.deleteEtudiant(e2);
	            e1.getAllEtudiants();
	        }
	        catch(Exception exc){
	            System.out.println(exc.getMessage());
	        }
	    }
}
