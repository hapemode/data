package com.ppx.structure;

/**
 * 单向链表哨兵
 */
public class SinglyLinkedListSentinel {

    private Node head = new Node(Integer.MIN_VALUE, null);

    class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 根据索引查找
     *
     * @param index
     * @return
     */
    public Node findByIndex(int index) {
        int i = -1;
        for (Node node = this.head; node != null; node = node.next, i++) {
            if (i == index) {
                return node;
            }
        }
        return null;
    }

    /**
     * 查找尾节点
     *
     * @return
     */
    public Node findLast() {
        Node curr;
        for (curr = this.head; curr.next != null; ) {
            curr = curr.next;
        }
        return curr;
    }

    /**
     * 头添加
     */
    public void addFirst(int value) {
        this.head.next = new Node(value, this.head.next);
    }

    /**
     * 尾添加
     */
    public void addLast(int value) {
        Node curr;
        for (curr = this.head; curr.next != null; ) {
            curr = curr.next;
        }
        curr.next = new Node(value, null);
    }

    public void forEach() {
        Node curr;
        for (curr = this.head; curr.next != null; ) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }


}
