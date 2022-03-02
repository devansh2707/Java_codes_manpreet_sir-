package com.kts.multithreading;

public class SingleThreadAccess {

    private static String threadName;

    public static synchronized void setThreadName(String threadName, int i) {
        SingleThreadAccess.threadName = threadName;
        System.out.println(SingleThreadAccess.threadName + " " + i);
    }
}
