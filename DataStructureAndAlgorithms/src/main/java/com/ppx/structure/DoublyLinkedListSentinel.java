package com.ppx.structure;

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


    public void addFirst(int value) {
        insert(0, value);
    }

    public void removeFirst(int value) {
        remove(0);
    }

    public void addLast(int value) {

    }

    public void removeLast(int value) {

    }

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

    public void remove(int index) {
        Node node = findByIndex(index);
        if (node == null || node.next == null) {
            throw new RuntimeException();
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private Node findByIndex(int index) {
        int i = -1;
        for (Node n = head; n != tail; n = n.next) {
            if (i == index) {
                return n;
            }
            i++;
        }
        return null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
