package com.example.demo.string;

/**
 * Created by krrishnaaaa on September 10, 2016
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        // true : value (address of "hello" from String constant pool) stored in s1 is same as in s2
        System.out.println(s1 == s2);

        // false : new address is generated for s3 which is not same as the value in s1
        System.out.println(s1 == s3);

        // true : value at address contained in s1 and s2 are same
        System.out.println(s1.equals(s2));

        // true : value at address contained in s1 and s3 are same
        System.out.println(s1.equals(s3));
    }
}
