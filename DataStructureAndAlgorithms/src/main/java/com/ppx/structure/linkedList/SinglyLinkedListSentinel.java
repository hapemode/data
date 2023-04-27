package com.ppx.structure.linkedList;

import java.util.Iterator;

/**
 * 单向链表哨兵
 */
public class SinglyLinkedListSentinel implements Iterable<Integer> {

    private Node head = new Node(Integer.MIN_VALUE, null);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node n = head.next;

            @Override
            public boolean hasNext() {
                return n != null;
            }

            @Override
            public Integer next() {
                int value = n.value;
                n = n.next;
                return value;
            }
        };
    }

    class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) {
        insert(0, value);
    }

    public void addLast(int value) {

    }

    public void removeFirst(int value) {

    }

    public void removeLast(int value) {

    }

    public void insert(int index, int value) {
        Node pre = findNode(index - 1);
        if (pre == null) {
            throw new IndexOutOfBoundsException();
        }
        pre.next = new Node(value, pre.next);

    }

    public void remove(int index, int value) {

    }

    private Node findNode(int index) {
        int i = -1;
        for (Node node = head; node != null; node = node.next, i++) {
            if (i == index) {
                return node;
            }
        }
        return null;
    }

    /**
     * 遍历
     */
    public void forEach() {
        Node curr;
        for (curr = this.head; curr != null; ) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
}
