package com.ppx.structure;

import java.util.Iterator;

/**
 * 单向链表
 */
public class SinglyLinkedList implements Iterable<Integer> {

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
        this.head = new Node(value, head);
    }

    /**
     * 链表尾部添加
     *
     * @param value
     */
    public void addLast(int value) {
        Node node = findLast(head);
        if (node == null) {
            this.head = new Node(value, null);
        } else {
            node.next = new Node(value, null);
        }
    }

    /**
     * 尾部添加多个
     *
     * @param first
     * @param rest
     */
    public void addLast(int first, int... rest) {

        Node sublist = new Node(first, null);
        Node curr = sublist;
        for (int value : rest) {
            curr.next = new Node(value, null);
            curr = curr.next;
        }
        Node last = findLast(head);
        if (last == null) {
            this.head = sublist;
            return;
        }
        last.next = sublist;
    }

    private Node findLast(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        } else {
            return findLast(head.next);
        }
    }

    /**
     * 根据索引查找
     *
     * @param index
     * @return
     */
    public int findByIndex(int index) {
        int i = 0;
        for (Node next = head; next != null; next = next.next) {
            if (i == index) {
                return next.value;
            }
            i++;
        }
        return -1;
    }

    /**
     * 插入
     *
     * @param index
     * @param value
     */
    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node node = findNode(index - 1);
        if (node != null) {
            node.next = new Node(value, node.next);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * 移除
     *
     * @param index
     */
    public void remove(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
                return;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        Node node = findNode(index - 1);
        Node curr;
        if (node != null && (curr = node.next) != null) {
            node.next = curr.next;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node findNode(int index) {
        int i = 0;
        for (Node next = head; next != null; next = next.next) {
            if (i == index) {
                return next;
            }
            i++;
        }
        return null;
    }

    /**
     * 遍历
     */
    public void loopWhile() {
        Node next = head.next;
        while (next != null) {
            System.out.println(next.value);
            next = next.next;
        }
    }

    /**
     * 遍历for循环
     */
    public void loopForeach() {
        for (Node next = head; next != null; next = head.next) {
            System.out.println(next.value);
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
            @Override
            public boolean hasNext() {
                return null != head.next;
            }

            @Override
            public Integer next() {
                return head.value;
            }
        };
    }

    /**
     * 递归遍历
     *
     * @param
     */
    public void loopRecursion() {
        recursion(this.head);
    }

    public void recursion(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        recursion(node.next);
    }
}

