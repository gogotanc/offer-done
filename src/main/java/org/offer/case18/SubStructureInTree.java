package org.offer.case18;

import org.offer.utils.BinaryTreeNode;

/**
 * 面试题 18：树的子结构
 * Created by tanc on 2017/3/30.
 */
public class SubStructureInTree {

    public static <T> boolean hasSubTree(BinaryTreeNode<T> tree, BinaryTreeNode<T> sub) {
        if (null == tree) {
            return null == sub;
        }

        if (!tree.equals(sub)) {
            return hasSubTree(tree.left, sub) || hasSubTree(tree.right, sub);
        }

        return compare(tree, sub);
    }

    private static <T> boolean compare(BinaryTreeNode<T> tree, BinaryTreeNode<T> sub) {

        if (null == tree) {
            return null == sub;
        }
        if (!tree.equals(sub)) {
            return false;
        }

        return compare(tree.left, sub.left) && compare(tree.right, sub.right);
    }
}
