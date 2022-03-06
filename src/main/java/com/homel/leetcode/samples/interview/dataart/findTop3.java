package com.homel.leetcode.samples.interview.dataart;

public class findTop3 {

    static void print3largest(int arr[], int arr_size) {
        int i, first, second, third;

        /* There should be atleast three elements */
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

}
