package com.kts.multithreading;

public class MySynchronizedMain {
    public static void main(String[] s) {
        SynchronizedThread obj1 = new SynchronizedThread("MyThread-A");
        SynchronizedThread obj2 = new SynchronizedThread("MyThread-B");

        Thread threadObj1 = new Thread(obj1);
        Thread threadObj2 = new Thread(obj2);

        threadObj1.start();
        threadObj2.start();
    }
}
