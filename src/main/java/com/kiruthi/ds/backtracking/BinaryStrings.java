package com.kiruthi.ds.backtracking;

import java.util.Arrays;

public class BinaryStrings {


    static int[] A = new int[3];

    static void produceBinaryStrings(int n) {

        if (n < 1) {
            System.out.println(Arrays.toString(A));
        } else {
            A[n - 1] = 0;
            produceBinaryStrings(n - 1);
            A[n - 1] = 1;
            produceBinaryStrings(n - 1);
        }
    }

    public static void main(String[] args) {
        BinaryStrings.produceBinaryStrings(3);
    }
}
