package com.ppx.da;

import java.util.Iterator;

/**
 * 单项链表
 */
public class SingNode implements Iterable<Integer> {

    Node head = null;

    class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 单向链表从头添加
     *
     * @param value
     */
    public void addFirst(int value) {
        head = new Node(value, head);
    }

    /**
     * 遍历
     */
    public void loop1() {

    }

    /**
     * 遍历
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        new Iterator<Iterator>() {
            @Override
            public boolean hasNext() {
                return null != head.next;
            }

            @Override
            public Iterator next() {

                return null;
            }
        }
    }

}

