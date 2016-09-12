package com.example.demo.exception;

/**
 * Created by krrishnaaaa on September 12, 2016
 */
public class DemoException {

    DemoException demo;

    public static void main(String[] args) {
        DemoException demoException = new DemoException();
        System.out.println(demoException.getInt());
    }

    public int getInt() {
        try {
            System.out.println("try");
            demo.printHello();
            return 1;
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
            System.exit(2);
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

    public void printHello() {
        System.out.println("hello");
    }
}
