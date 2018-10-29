package com.kiruthi.ds.backtracking;

import java.util.Arrays;

public class KString {

    static int[] A = new int[2];

    static void kString(int n, int k) {
        if (n < 1) {
            System.out.println(Arrays.toString(A));
        } else {
            for (int j = 0; j < k; j++) {
                A[n - 1] = j;
                kString(n - 1, k);
            }
        }
    }

    public static void main(String[] args) {
        KString.kString(2, 3);
    }
}
