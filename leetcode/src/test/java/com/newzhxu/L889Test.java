package com.newzhxu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L889Test {

    @Test
    void constructFromPrePost() {
        L889 l889 = new L889();
        int[] pre = new int[]{1, 2, 4, 5, 3, 6, 7};
        int[] post = new int[]{4, 5, 2, 6, 7, 3, 1};
        L889.TreeNode result = l889.constructFromPrePost(pre, post);
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.left.left.val);
        assertEquals(5, result.left.right.val);
        assertEquals(6, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }
}