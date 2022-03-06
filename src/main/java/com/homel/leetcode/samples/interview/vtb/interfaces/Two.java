package com.homel.leetcode.samples.interview.vtb.interfaces;

@FunctionalInterface
public interface Two extends One {
     default void method1() {
       System.out.println("Two::method1");
   }
}
