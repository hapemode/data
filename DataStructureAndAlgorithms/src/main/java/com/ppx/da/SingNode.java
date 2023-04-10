package com.ppx.da;

/**
 * 单项链表
 */
public class SingNode {

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

    public void loop1(){

    }

}

