package com.kts.multithreading;

public class MyThread implements Runnable {

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
