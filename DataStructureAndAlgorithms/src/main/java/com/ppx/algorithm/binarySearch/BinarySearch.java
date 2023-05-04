package com.ppx.algorithm.binarySearch;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 二分查找基础版
     *
     * @param arr
     * @param target
     * @return
     */
    public static int bs1(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (arr[m] < target) {
                i = m + 1;
            } else if (target < arr[m]) {
                j = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找改进
     *
     * @param arr
     * @param target
     * @return
     */
    public static int bs2(int[] arr, int target) {
        int i = 0, j = arr.length;
        while (i < j) {
            int m = (i + j) >>> 1; // 移位运算避免越界
            if (arr[m] < target) {
                i = m + 1;
            } else if (target < arr[m]) {
                j = m;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找平衡版
     *
     * @param arr
     * @param target
     * @return
     */
    public static int bs3(int[] arr, int target) {
        int i = 0, j = arr.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m;
            } else {
                i = m;
            }
        }
        if (arr[i] == target) {
            return i;
        } else {
            return -1;
        }
    }

    /**
     * 二分最左查找
     *
     * @param arr
     * @param target
     * @return
     */
    public static int bsLeft(int[] arr, int target) {
        int i = 0, j = arr.length;
        int candidate = -1;
        while (i < j) {
            int m = (i + j) >>> 1;
            if (arr[m] < target) {
                i = m + 1;
            } else if (target < arr[m]) {
                j = m;
            } else {
                j = m;
                candidate = m;
            }
        }
        return candidate;
    }

    /**
     * 二分最右查找
     *
     * @param arr
     * @param target
     * @return
     */
    public static int bsRight(int[] arr, int target) {
        int i = 0, j = arr.length;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (arr[m] < target) {
                i = m + 1;
            } else if (target < arr[m]) {
                j = m - 1;
            } else {
                i = m + 1;
                candidate = m;
            }
        }
        return candidate;
    }
}
