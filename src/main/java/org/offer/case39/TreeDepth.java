package org.offer.case39;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 39
 * 题目一: 二叉树的深度
 * Created by tanc on 17-6-14.
 */
public class TreeDepth {

    public static <E> int methodOne(BinaryTreeNode<E> root) {

        return treeDepth(root);
    }

    private static <E> int treeDepth(BinaryTreeNode<E> root) {
        if (null == root)
            return 0;
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
