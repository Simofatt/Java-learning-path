package TP6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DossierProxy implements Dossier {
    private DossierReel dossierReel;
    private String codeDossier;
    private String codeClient;

    public DossierProxy(String dossier, String codeDossier, String codeClient) {
        this.dossierReel = new DossierReel(dossier);
        this.codeDossier = codeDossier;
        this.codeClient = codeClient;
    }

    @Override
    public void afficherContenu() {
        System.out.println("Veuillez entrer le code d'accès pour accéder au dossier " + dossierReel.getDossier() + ": ");
        Scanner scanner = new Scanner(System.in);
        String codeSaisi = scanner.nextLine();
        if (codeDossier.equals(codeSaisi) && codeClient.equals(codeSaisi)) {
            dossierReel.afficherContenu();
        } else {
            System.out.println("Accès refusé.");
        }
    }

    @Override
    public List<String> getFichiers() {
        System.out.println("Veuillez entrer le code d'accès pour accéder au dossier " + dossierReel.getDossier() + ": ");
        Scanner scanner = new Scanner(System.in);
        String codeSaisi = scanner.nextLine();
        if (codeDossier.equals(codeSaisi) && codeClient.equals(codeSaisi)) {
            return dossierReel.getFichiers();
        } else {
            System.out.println("Accès refusé.");
            return new ArrayList<>();
        }
    }

    @Override
    public boolean creerFichier(String nomFichier) {
        System.out.println("Veuillez entrer le code d'accès pour accéder au dossier " + dossierReel.getDossier() + ": ");
        Scanner scanner = new Scanner(System.in);
        String codeSaisi = scanner.nextLine();
        if (codeDossier.equals(codeSaisi) && codeClient.equals(codeSaisi)) {
            return dossierReel.creerFichier(nomFichier);
        } else {
            System.out.println("Accès refusé.");
            return false;
        }
    }

    @Override
    public boolean supprimerFichier(String nomFichier) {
        System.out.println("Veuillez entrer le code d'accès pour accéder au dossier " + dossierReel.getDossier() + ": ");
        Scanner scanner = new Scanner(System.in);
        String codeSaisi = scanner.nextLine();
        if (codeDossier.equals(codeSaisi) && codeClient.equals(codeSaisi)) {
            return dossierReel.supprimerFichier(nomFichier);
        } else {
            System.out.println("Accès refusé.");
            return false;
        }
    }
}
