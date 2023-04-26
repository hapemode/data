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
    public int findByIndex(int index) {
        int i = -1;
        for (Node node = this.head; node != null; node = node.next, i++) {
            if (i == index) {
                return node.value;
            }
        }
        return i;
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

    public void remove(int index) {
        Node node = findNode(index - 1);
        Node curr;
        if (node != null && (curr = node.next) != null) {
            node.next = curr.next;
        } else {
            throw new RuntimeException();
        }
    }

    private Node findNode(int index) {
        Node curr;
        int i = -1;
        for (curr = this.head; curr.next != null; ) {
            if (i == index) {
                return curr;
            }
            curr = curr.next;
            i++;
        }
        return null;
    }

    public void removeLast() {
        Node curr;
        for (curr = head.next; curr != null; ) {
            if (curr.next == null) {

            }
        }
    }

    public void removeByIndex() {

    }

    /**
     * 遍历
     */
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

    /**
     * 插入
     *
     * @param index
     * @param value
     */
    public void insert(int index, int value) {
        Node node = findNode(index - 1);
        if (node != null) {
            node.next = new Node(value, node.next);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node findNode(int index) {
        Node curr;
        int i = 0;
        for (curr = this.head; curr.next != null; curr = curr.next) {
            if (i == index) {
                return curr;
            }
            i++;
        }
        return null;
    }

}
