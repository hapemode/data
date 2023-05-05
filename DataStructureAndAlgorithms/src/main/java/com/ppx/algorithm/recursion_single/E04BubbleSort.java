package com.ppx.algorithm.recursion_single;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 递归冒泡
 */
public class E04BubbleSort {

    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }

    private static void bubble(int[] arr, int j) {
        if (j == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i + 1]) {
                int a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
                x = i;
            }
        }
        bubble(arr, x);
    }

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5};
        int[] a1 = {5, 4, 3, 2, 1};
        sort(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        sort(a2);
        assertArrayEquals(expected, a2);

        int[] a4 = {3, 1, 4, 2, 5};
        sort(a4);
        assertArrayEquals(expected, a4);

        int[] a3 = {1, 2, 3, 4, 5};
        sort(a3);
        assertArrayEquals(expected, a3);
    }
}
