package com.homel.leetcode.samples;

public class FibonacciNumber509 {
    public int fib1(int n) {
        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 0; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return a;
    }

    public int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fib2(n - 1);
        int f2 = fib2(n - 2);

        return f1 + f2;
    }
}
