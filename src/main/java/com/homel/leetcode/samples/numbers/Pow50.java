package com.homel.leetcode.samples.numbers;

public class Pow50 {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        return (n % 2 == 0) ? pow(x * x, n / 2) : x * pow(x * x, n / 2);
    }
}
