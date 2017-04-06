package org.offer.case19;

import org.offer.utils.BinaryTreeNode;

/**
 * 面试题 19：二叉树的镜像
 * Created by tanc on 2017/4/6.
 */
public class MirrorOfBinaryTree {

    /**
     * 递归实现
     */
    public static <T> void mirror(BinaryTreeNode<T> root) {

        if (null == root) {
            return;
        }

        BinaryTreeNode<T> temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }
}
