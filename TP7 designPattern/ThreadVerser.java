package TP7;

public class ThreadVerser implements Runnable {
    private Compte compte;
    private int montant;

    public ThreadVerser(Compte compte, int montant) {
        this.compte = compte;
        this.montant = montant;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            compte.crediter(montant);
        }
    }
}
