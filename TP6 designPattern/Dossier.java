package TP6;

import java.util.List;

public interface Dossier {
    void afficherContenu();
    List<String> getFichiers();
    boolean creerFichier(String nomFichier);
    boolean supprimerFichier(String nomFichier);
}
