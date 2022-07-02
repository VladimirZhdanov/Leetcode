package com.homel.leetcode.samples.numbers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.isEmpty()) {
                result.add(i + "");
            } else {
                result.add(sb.toString());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        FizzBuzz412 fizzBuzz412 = new FizzBuzz412();
        fizzBuzz412.fizzBuzz(15).forEach(System.out::println);
    }
}
