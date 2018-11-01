package com.kiruthi.ds.sorting;

// Optimized java implementation
// of Bubble sort

import java.io.*;

class BubbleSort {
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
/*
Worst case complexity : O(n2)
        Best case complexity (Improved version) : O(n)
        Average case complexity (Basic version) : O(n2)
        Worst case space complexity : O(1) auxiliary


        Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes

Stable: Yes

        */

// This code is contributed
// by Nikita Tiwari.
