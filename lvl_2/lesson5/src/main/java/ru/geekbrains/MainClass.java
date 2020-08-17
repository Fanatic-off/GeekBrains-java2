package ru.geekbrains;

public class MainClass extends Thread {

    static final int size = 10_000_000;
    static final int h = size / 2;

    public static void main(String[] args) {

        firstMethod();
        secondMethod();

    }

    public static void firstMethod() {
        float[] arr = new float[size];
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));
        }
        System.out.print("First method current time : ");
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void secondMethod() {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                System.arraycopy(arr, 0, a1, 0, h);
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                            * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a1, 0, arr, 0, h);

                System.out.print("Second method first thread current time : ");
                System.out.println(System.currentTimeMillis() - a);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                System.arraycopy(arr, h, a2, 0, h);
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                            * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a2, 0, arr, h, h);

                System.out.print("Second method second thread current time : ");
                System.out.println(System.currentTimeMillis() - a);
            }
        });

        t1.start();
        t2.start();

    }
}
