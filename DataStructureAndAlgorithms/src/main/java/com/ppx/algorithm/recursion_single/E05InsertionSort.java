package com.ppx.algorithm.recursion_single;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 插入排序
 */
public class E05InsertionSort {

    public static void sort(int[] arr) {
        insertion(arr, 1);
    }

    private static void insertion(int[] arr, int low) {
        if (low == arr.length) {
            return;
        }

        int t = arr[low];
        int i = low - 1;// 已排序区域指针
        while (i >= 0 && arr[i] > t) {
            arr[i + 1] = arr[i];// 空出插入位置
            i--;
        }
        if (i+1 != low){
            arr[i + 1] = t;// 找到插入位置
        }

        insertion(arr, low+1);
    }

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5};
        int[] a1 = {5, 4, 3, 2, 1};
        sort(a1);
        assertArrayEquals(expected, a1);

//        int[] a2 = {4, 5, 3, 2, 1};
//        sort(a2);
//        assertArrayEquals(expected, a2);
//
//        int[] a4 = {3, 1, 4, 2, 5};
//        sort(a4);
//        assertArrayEquals(expected, a4);
//
//        int[] a3 = {1, 2, 3, 4, 5};
//        sort(a3);
//        assertArrayEquals(expected, a3);
    }
}
