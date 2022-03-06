package com.homel.leetcode.samples.interview.luxsoft.interfaces.problem2;

public class ClazzImpl {
    public static void main(String[] args) {
        Interface<String> anInterface = () -> "Hi";

        String foo = anInterface.foo();
        System.out.println(foo);
    }
}