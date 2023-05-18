package TP8;


public class Main {
    public static void main(String[] args) {
        Compte compte = new Compte(1000);
        Thread thread1 = new Thread(new CompteModifier(compte, 100));
        Thread thread2 = new Thread(new CompteModifier(compte, 200));
        Thread thread3 = new Thread(new CompteModifier(compte, 300));
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Solde final: " + compte.consulterSolde());
    }
}