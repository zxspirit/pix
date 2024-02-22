package com.newzhxu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 889
 * 根据前序和后序遍历构造二叉树
 * https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/
 */
public class L889 {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        Map<Integer, Integer> postMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            postMap.put(postorder[i], i);
        }
        return dfs(preorder, postorder, postMap, 0, n - 1, 0, n - 1);


    }

    private TreeNode dfs(int[] preorder, int[] postorder, Map<Integer, Integer> postMap, int preLeft, int preRight, int postLeft, int postRight) {
        if (preLeft > preRight) {
            return null;
        }
        int leftCount = 0;
        if (preLeft < preRight) {
            leftCount = postMap.get(preorder[preLeft + 1]) - postLeft + 1;
        }
        return new TreeNode(preorder[preLeft],
                dfs(preorder, postorder, postMap, preLeft + 1, preLeft + leftCount, postLeft, postLeft + leftCount - 1),
                dfs(preorder, postorder, postMap, preLeft + leftCount + 1, preRight, postLeft + leftCount, postRight - 1));
    }


}
