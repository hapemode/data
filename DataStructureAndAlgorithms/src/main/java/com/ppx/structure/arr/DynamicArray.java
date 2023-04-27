package com.ppx.structure.arr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

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

    /**
     * 添加末位元素
     *
     * @param element
     */
    public void addLast(int element) {
        add(size, element);
    }

    /**
     * 指定位置[0,...size)添加元素
     *
     * @param index
     * @param element
     */
    public void add(int index, int element) {
        checkAndGrow();
        if (index >= 0 && index < size) {
            System.arraycopy(arr, index, arr, index + 1, size - index);
        }
        arr[index] = element;
        size++;
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
     * 移除元素
     *
     * @param index
     * @return
     */
    public int remove(int index) {
        int remove = arr[index];
        if (index < size - 1) {
            System.arraycopy(arr, index + 1,
                    arr, index, size - index - 1);
        }
        size--;
        return remove;
    }

    public int get(int index) {
        return arr[index];
    }

    /**
     * 遍历
     *
     * @param consumer
     */
    public void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(arr[i]);
        }
    }

    /**
     * 遍历-迭代器
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public Integer next() {
                return arr[i++];
            }
        };
    }

    public IntStream stream() {
        return IntStream.of(Arrays.copyOfRange(arr, 0, size));
    }
}
