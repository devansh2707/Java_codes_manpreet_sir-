package com.kts.multithreading;

public class MyMain {
    public static void main(String[] s) {
        MyThread obj1 = new MyThread("MyThread-A");
        MyThread obj2 = new MyThread("MyThread-B");

        Thread threadObj1 = new Thread(obj1);
        Thread threadObj2 = new Thread(obj2);

        threadObj1.start();
        threadObj2.start();

        for (int i=0; i<5; i++) {
            System.out.println("MainThread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
