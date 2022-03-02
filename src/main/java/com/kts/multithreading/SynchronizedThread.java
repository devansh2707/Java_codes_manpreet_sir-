package com.kts.multithreading;

public class SynchronizedThread implements Runnable {

    private String threadName;

    public SynchronizedThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            SingleThreadAccess.setThreadName(threadName, i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
