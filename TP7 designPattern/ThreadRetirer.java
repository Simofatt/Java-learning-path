package TP7;

public class ThreadRetirer implements Runnable {
    private Compte compte;
    private int montant;

    public ThreadRetirer(Compte compte, int montant) {
        this.compte = compte;
        this.montant = montant;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            compte.debiter(montant);
        }
    }
}