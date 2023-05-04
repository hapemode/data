package com.ppx.structure.linkedList;

import java.util.Iterator;

public class DoublyAnnularLinkedListSentinel implements Iterable<Integer> {

    private Node sentinel = new Node(null, -1, null);

    private static class Node {
        private Node prev;
        private int value;
        private Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public DoublyAnnularLinkedListSentinel() {
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(int value) {
        insert(0, value);
    }

    public void addLast(int value) {
        Node prev = sentinel.prev;
        Node node = new Node(prev, value, sentinel);
        prev.next = node;
        sentinel.prev = node;
    }

    public void insert(int index, int value) {
        Node node = findNode(index);
        if (node == null) {
            throw new IllegalArgumentException();
        }
        Node in = new Node(node.prev, value, node);
        node.prev = in;
        node.prev.next = in;

    }

    private Node findNode(int index) {
        int i = -1;
        for (Node n = sentinel; n.next != sentinel; n = n.next, i++) {
            if (i == index) {
                return n;
            }
        }
        return null;
    }

    public void removeFirst() {
        remove(0);
    }

    private void remove(int index) {
        Node node = findNodeByIndex(index);
        if (node == sentinel) {
            throw new IllegalArgumentException();
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void removeLast() {
        Node prev = sentinel.prev;
        if (prev == sentinel) {
            throw new IllegalArgumentException();
        }
        Node prev1 = prev.prev;
        prev1.next = sentinel;
        sentinel.prev = prev1;
    }

    private Node findNodeByIndex(int index) {
        int i = -1;
        for (Node n = sentinel; n.next != sentinel; n = n.next, i++) {
            if (i == index) {
                return n;
            }
        }
        return null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node n = sentinel.next;

            @Override
            public boolean hasNext() {
                return n.next != sentinel;
            }

            @Override
            public Integer next() {
                int value = n.value;
                n = n.next;
                return value;
            }
        };
    }
}
