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
            throw new IndexOutOfBoundsException();
        }
        node.prev = new Node(node, value, node.next);

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

    public void removeFirst(int value) {
        Node node = findNodeByIndex(0);
        if (node == sentinel) {
            throw new IllegalArgumentException();
        }
    }


    public void removeLast(int value) {

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
