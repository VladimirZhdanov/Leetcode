package com.homel.leetcode.samples;

public class NumberOfStepsToReduceNumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (true) {
            if (num == 0) return steps;
            if (num % 2 != 0) {
                num--;
            } else {
                num = num / 2;
            }
            steps++;
        }

    }
}
