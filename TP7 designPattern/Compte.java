package TP7;

//QUESTION 2
public class Compte {
    private int solde;

    public Compte(int soldeInitial) {
        solde = soldeInitial;
    }

    public synchronized void crediter(int montant) {
        solde += montant;
    }

    public synchronized void debiter(int montant) {
        solde -= montant;
    }

    public synchronized int consulterSolde() {
        return solde;
    }
}






