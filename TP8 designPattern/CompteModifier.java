package TP8;

public class CompteModifier implements Runnable {
    private Compte compte;
    private int montant;

    public CompteModifier(Compte compte, int montant) {
        this.compte = compte;
        this.montant = montant;
    }

    public void run() {
        compte.crediter(montant);
        compte.debiter(montant);
    }
}


