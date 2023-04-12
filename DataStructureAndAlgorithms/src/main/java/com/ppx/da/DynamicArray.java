package com.ppx.da;

import java.util.Iterator;

/**
 * 动态数组
 */
public class DynamicArray implements Iterable<Integer> {
    /**
     * 逻辑大小
     */
    private int size = 0;
    /**
     * 容量
     */
    private int capacity = 8;

    private int[] arr = {};

    public void add(int index, int element) {
        checkAndGrow();
    }

    /**
     * 容量检查
     */
    private void checkAndGrow() {
        if (size == 0) {
            arr = new int[capacity];
        } else if (size == capacity) {
            capacity += capacity >>> 1;
            int[] newArr = new int[capacity];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
    }

    /**
     * 遍历-迭代器
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
