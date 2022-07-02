package com.homel.leetcode.samples.numbers;

import java.math.BigInteger;

public class FactorialTrailingZeroes172 {
    public static void main(String[] args) {

        System.out.println(trailingZeroes(3743)); // 5! = 120 then 1

        System.out.println(calculate(BigInteger.valueOf(3743)));

        System.out.println(trailingZeroesMy(3743));


        System.out.println(Math.pow(5, -2));
    }

    public static int trailingZeroesMy(int n) {
        int count = 0;
        BigInteger num = calculate(BigInteger.valueOf(n));;
        while (num.mod(new BigInteger("10")).equals(BigInteger.ZERO)) {
            num = num.divide(BigInteger.valueOf(10));
            count++;
        }
        return count;
    }

    public static int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    private static BigInteger calculate(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) > 0) {
            return n.multiply(calculate(n.subtract(BigInteger.ONE)));
        }
        return BigInteger.ONE;
    }
}
