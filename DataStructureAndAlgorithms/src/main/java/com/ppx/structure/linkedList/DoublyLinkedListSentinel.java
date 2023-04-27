package com.ppx.structure.linkedList;

import java.util.Iterator;

public class DoublyLinkedListSentinel implements Iterable<Integer> {

    class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, Integer.MIN_VALUE, null);
        tail = new Node(null, Integer.MIN_VALUE, null);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 头添加
     *
     * @param value
     */
    public void addFirst(int value) {
        insert(0, value);
    }

    /**
     * 头移除
     */
    public void removeFirst() {
        remove(0);
    }

    /**
     * 尾添加
     *
     * @param value
     */
    public void addLast(int value) {
        Node prev = tail.prev;
        Node node = new Node(prev, value, tail);
        prev.next = node;
        tail.prev = node;
    }

    /**
     * 尾移除
     */
    public void removeLast() {
        Node last = tail.prev;
        if (last == head) {
            throw new IndexOutOfBoundsException();
        }
        Node prev = last.prev;
        prev.next = tail;
        tail.prev = head;
    }

    /**
     * 节点插入
     *
     * @param index
     * @param value
     */
    public void insert(int index, int value) {
        // 找到本身
        Node pre = findByIndex(index - 1);
        if (pre == null) {
            throw new RuntimeException();
        }
        Node next = pre.next;
        Node node = new Node(pre, value, next);
        pre.next = node;
        node.prev = node;
    }

    /**
     * 节点移除
     *
     * @param index
     */
    public void remove(int index) {
        Node node = findByIndex(index);
        if (node == null || node.next == null) {
            throw new IndexOutOfBoundsException();
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    /**
     * 节点查找
     *
     * @param index
     * @return
     */
    private Node findByIndex(int index) {
        int i = -1;
        for (Node n = head; n != tail; n = n.next, i++) {
            if (i == index) {
                return n;
            }
        }
        return null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node node = head.next;

            @Override
            public boolean hasNext() {
                return node != tail;
            }

            @Override
            public Integer next() {
                int value = node.value;
                node = node.next;
                return value;
            }
        };
    }
}
