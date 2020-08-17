package ru.GeekBrains;

public class Main extends Thread {

    private final Object monitor = new Object();
    private static char currentLetter = 'A';
    private int count = 5;

    public static void main(String[] args) {
        Main main = new Main();
        Thread t1 = new Thread(()->
                main.printA()
        );
        Thread t2 = new Thread(()->
                main.printB()
        );
        Thread t3 = new Thread(()->
                main.printC()
        );
        t1.start();
        t2.start();
        t3.start();
    }

    public void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < count; i++) {
                    while (currentLetter != 'A') {
                        monitor.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < count; i++) {
                    while (currentLetter != 'B') {
                        monitor.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < count; i++) {
                    while (currentLetter != 'C') {
                        monitor.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
