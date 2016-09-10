package com.example.demo.thread;

/**
 * Created by krrishnaaaa on September 10, 2016
 */
public class ThreadImpl2 {
    public static void main(String[] args) {
        new Thread(new Runnable2(), "ThreadImpl2").start();
    }
}

class Runnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Runnable2 implements Runnable {
    @Override
    public void run() {
        new Thread(new Runnable1(), "Runnable1 A").run(); // mind the method call
        new Thread(new Runnable1(), "Runnable1 B").start(); // mind the method call
        System.out.println(Thread.currentThread().getName());
    }
}