package org.offer.case63;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 63: 二叉搜索树的第 K 个节点
 * Created by tanc on 2017/7/12.
 */
public class BinaryTreeKth {

    private static int index = 0;

    public static <E> BinaryTreeNode<E> methodOne(BinaryTreeNode<E> root, int k) {

        index = 0;

        return aaa(root, k);

    }

    private static <E> BinaryTreeNode<E> aaa(BinaryTreeNode<E> root, int k) {
        if (null == root) {
            return null;
        }
        BinaryTreeNode<E> result;
        result = aaa(root.left, k);
        if (null != result) {
            return result;
        }
        if (++index == k) {
            return root;
        }
        return aaa(root.right, k);
    }

}
