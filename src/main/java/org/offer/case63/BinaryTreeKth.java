package org.offer.case63;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 63: 二叉搜索树的第 K 个节点
 * Created by tanc on 2017/7/12.
 */
public class BinaryTreeKth {

    private static int index = 0;

    /**
     * 二叉搜索树的特点是中序遍历就是从小到大的顺序
     * 找第 k 大的节点就是中序遍历的第 k 个节点。
     */
    public static <E> BinaryTreeNode<E> methodOne(BinaryTreeNode<E> root, int k) {

        index = 0;

        return findKthNode(root, k);

    }

    private static <E> BinaryTreeNode<E> findKthNode(BinaryTreeNode<E> root, int k) {
        if (null == root) {
            return null;
        }
        BinaryTreeNode<E> result;
        result = findKthNode(root.left, k);
        if (null != result) {
            return result;
        }
        if (++index == k) {
            return root;
        }
        return findKthNode(root.right, k);
    }

}
