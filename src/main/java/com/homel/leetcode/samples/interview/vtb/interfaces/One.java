package com.homel.leetcode.samples.interview.vtb.interfaces;

public interface One {
    default void method1() {
        System.out.println("One::method1");
    }

    void method2();
}
