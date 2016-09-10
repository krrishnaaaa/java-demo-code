package com.example.demo.string;

import java.util.Stack;

/**
 * Created by krrishnaaaa on September 10, 2016
 */
public class BalancedString {

    public static void main(String[] args) {
        String testString = "adf(aew)23[34v3a*23]ade(we{wefave}qwef)ad[e[qew]]";
        if(args.length > 0) {
            testString = args[0];
        }

        Stack<Character> stringStack = new Stack<>();
        char[] chars = testString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '[':
                case '{':
                    stringStack.push(chars[i]);
                    break;
                case ')':
                    if (isMatchingClose(stringStack, '(')) {
                        System.out.println("Not balanced: no matching (");
                        return;
                    }
                    break;
                case ']':
                    if (isMatchingClose(stringStack, '[')) {
                        System.out.println("Not balanced: no matching [");
                        return;
                    }
                    break;
                case '}':
                    if (isMatchingClose(stringStack, '{')) {
                        System.out.println("Not balanced: no matching {");
                        return;
                    }
                    break;
            }
        }
        System.out.println(testString + " is balanced String.");
    }

    private static boolean isMatchingClose(Stack<Character> stringStack, char openingBracket) {
        return stringStack.isEmpty() || !stringStack.pop().equals(openingBracket);
    }
}
