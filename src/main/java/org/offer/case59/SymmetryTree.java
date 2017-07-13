package org.offer.case59;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 59: 对称的二叉树
 * Created by tanc on 2017/7/12.
 */
public class SymmetryTree {

    /**
     * 使用递归比较根节点的左子树和右子树
     */
    public static <E> boolean methodOne(BinaryTreeNode<E> root) {
        if (null == root) {
            return false;
        }
        return isSymmetry(root.left, root.right);
    }

    /**
     * 比较两个树是否为对称的
     */
    private static <E> boolean isSymmetry(BinaryTreeNode<E> left, BinaryTreeNode<E> right) {

        if (null == left) {
            return null == right;
        } else if (null == right) {
            return false;
        }

        if (left.data.equals(right.data)) {
            return isSymmetry(left.left, right.right) && isSymmetry(left.right, right.left);
        } else {
            return false;
        }
    }
}
