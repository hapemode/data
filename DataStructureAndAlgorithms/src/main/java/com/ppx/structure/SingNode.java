package com.ppx.structure;

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
        this.head = new Node(value, head);
    }

    /**
     * 链表尾部添加
     *
     * @param value
     */
    public void addLast(int value) {
        Node node = findLast(head);
    }

    private Node findLast(Node head) {
        if (head.next == null) {
            return head;
        } else {
            head = head.next;
            return findLast(head);
        }
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
     * @param node
     */
    public void recursion(Node node) {
        if (node.next == null) {
            return;
        }

        System.out.println(node.value);

        recursion(node.next);
    }
}

