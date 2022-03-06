package com.homel.leetcode.samples.interview.vtb;

public class StaticShit {
    static void perform() {
        System.out.println("Hi");
    }

    private StaticShit x;

    public static void main(String s[]) {
        //x.perform(); // корректно ли это выражение?
    }
}
