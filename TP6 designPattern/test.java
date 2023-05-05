package TP6;
import java.util.List;
public class test {




	    
	    public static void main(String[] args) {
	        // Création d'un dossier proxy avec les codes d'accès requis
	        Dossier dossier = new DossierProxy("Dossier secret", "1234", "5678");
	        
	        // Test de la méthode afficherContenu
	        dossier.afficherContenu();
	        
	        // Test de la méthode getFichiers
	        List<String> fichiers = dossier.getFichiers();
	        System.out.println("Liste des fichiers : " + fichiers);
	        
	        // Test de la méthode creerFichier
	        boolean fichierCree = dossier.creerFichier("Nouveau fichier");
	        if (fichierCree) {
	            System.out.println("Le fichier a été créé avec succès.");
	        } else {
	            System.out.println("Une erreur est survenue lors de la création du fichier.");
	        }
	        
	        // Test de la méthode supprimerFichier
	        boolean fichierSupprime = dossier.supprimerFichier("Fichier secret.txt");
	        if (fichierSupprime) {
	            System.out.println("Le fichier a été supprimé avec succès.");
	        } else {
	            System.out.println("Une erreur est survenue lors de la suppression du fichier.");
	        }
	    }
	}

