package TP7;

public class Test {
    public static void main(String[] args) {
        Compte compte = new Compte(0);

        Thread[] threads = new Thread[40];

        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new ThreadVerser(compte, 10));
            threads[i].start();
        }

        for (int i = 20; i < 40; i++) {
            threads[i] = new Thread(new ThreadRetirer(compte, 10));
            threads[i].start();
        }

        for (int i = 0; i < 40; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Solde final : " + compte.consulterSolde());
    }
}