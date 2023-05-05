package com.ppx.algorithm.recursion_single;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 递归二分查找
 */
public class E03BinarySearch {

    public static int search(int[] arr, int target) {
        return f(arr, target, 0, arr.length);
    }

    private static int f(int[] arr, int target, int i, int j) {
        int m = (i + j) >>> 1;
        if (target < arr[m]) {
            return f(arr, target, i, m - 1);
        } else if (arr[m] < target) {
            return f(arr, target, m + 1, j);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, search(a, 7));
        assertEquals(1, search(a, 13));
        assertEquals(2, search(a, 21));
        assertEquals(3, search(a, 30));
        assertEquals(4, search(a, 38));
        assertEquals(5, search(a, 44));
        assertEquals(6, search(a, 52));
        assertEquals(7, search(a, 53));

//        assertEquals(-1, search(a, 0));
//        assertEquals(-1, search(a, 15));
//        assertEquals(-1, search(a, 60));
    }
}
