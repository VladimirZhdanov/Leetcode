package com.homel.leetcode.samples.interview.vtb;

public class Nums {

    //Каким будет результат следующих действий?
    //все операции дадут 0.5
    //все операции дадут 0
    //0, 0.5, 0, 0.5
    //0, 0.5, 0.5, 0.5
    public static void main(String[] args) {
        System.out.println(1/2);
        System.out.println(1./2);
        System.out.println(1/2.);
        System.out.println(1./2.);

        short i = 1;
        short j = 1;
        System.out.println(i/j);
    }
}
