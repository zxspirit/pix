package com.newzhxu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L144Test {

    @Test
    void preorderTraversal() {
        L144 l144 = new L144();
        L144.TreeNode root = new L144.TreeNode(1, null, new L144.TreeNode(2, new L144.TreeNode(3), null));
        System.out.println(l144.preorderTraversal(root));
        assertEquals("[1, 2, 3]", l144.preorderTraversal(root).toString());

    }

}