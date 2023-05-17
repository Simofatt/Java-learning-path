package TP7;

public class Main {
    private static Object verrou = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ClasseARunnable());
        Thread thread2 = new ClasseBThread();

        thread1.start();
        thread2.start();
    }

    static class ClasseARunnable implements Runnable {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                synchronized (verrou) {
                    System.out.println("Thread " + i + " de la classe A");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ClasseBThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                synchronized (verrou) {
                    System.out.println("Thread " + i + " de la classe B");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
