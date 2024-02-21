package com.newzhxu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L206Test {
    /**
     * leetcode 206. 反转链表
     */
    @Test
    void reverseList() {
        L206.ListNode head = new L206.ListNode(1, new L206.ListNode(2, new L206.ListNode(3, new L206.ListNode(4, new L206.ListNode(5, null)))));
        L206 l206 = new L206();
        L206.ListNode result = l206.reverseList(head);
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }
    @Test
    void reverseList2() {
        L206.ListNode head = new L206.ListNode(1, new L206.ListNode(2, new L206.ListNode(3, new L206.ListNode(4, new L206.ListNode(5, null)))));
        L206 l206 = new L206();
        L206.ListNode result = l206.reverseList2(head);
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }
}