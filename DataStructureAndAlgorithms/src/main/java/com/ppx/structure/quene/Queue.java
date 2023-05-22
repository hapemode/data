package com.ppx.structure.quene;

public interface Queue<T> {

    /**
     * 队尾插入
     *
     * @param t
     * @return
     */
    boolean offer(T t);

    /**
     * 对头获取并移除
     *
     * @return
     */
    T poll();

    /**
     * 队头获取
     *
     * @return
     */
    T peak();

    /**
     * 检查对队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 检查队列是否已满
     *
     * @return
     */
    boolean isFull();
}
