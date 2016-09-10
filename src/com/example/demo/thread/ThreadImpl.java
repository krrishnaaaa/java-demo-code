package com.example.demo.thread;

/**
 * Created by krrishnaaaa on September 10, 2016
 */
public class ThreadImpl {
    public static void main(String[] args) {
        new DemoThread(new DemoRunnable()).start();
        new DemoThread().start();
        new Thread(new DemoRunnable()).start();
    }
}

class DemoThread extends Thread {
    public DemoThread() {
    }

    public DemoThread(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        System.out.println("DemoThread");
    }
}

class DemoRunnable implements Runnable {
    public void run() {
        System.out.println("DemoRunnable");
    }
}