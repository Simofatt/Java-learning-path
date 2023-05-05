package TP6;

import java.util.ArrayList;
import java.util.List;

public class DossierReel implements Dossier {
    private String dossier;
    private List<String> fichiers;

    public DossierReel(String dossier) {
        this.dossier = dossier;
        this.fichiers = new ArrayList<>();
    }

    @Override
    public void afficherContenu() {
        System.out.println("Contenu du dossier " + dossier + ": ");
        /* Code pour afficher le contenu du dossier */;
    }

    @Override
    public List<String> getFichiers() {
        return fichiers;
    }

    @Override
    public boolean creerFichier(String nomFichier) {
        return fichiers.add(nomFichier);
    }

    @Override
    public boolean supprimerFichier(String nomFichier) {
        return fichiers.remove(nomFichier);
    }

    public String getDossier() {
        return dossier;
    }
}
