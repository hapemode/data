package com.ppx.structure.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DoublyAnnularLinkedListSentinelTest {

    public static DoublyAnnularLinkedListSentinel getNode() {
        DoublyAnnularLinkedListSentinel sentinel = new DoublyAnnularLinkedListSentinel();
        sentinel.addLast(1);
        sentinel.addLast(2);
        sentinel.addLast(3);
        return sentinel;
    }

    @Test
    public void t1() {
        DoublyAnnularLinkedListSentinel node = getNode();
        node.removeFirst();
        // TODO: 2023/4/28
        Assertions.assertIterableEquals(Arrays.asList(2,3),node);
    }
}
