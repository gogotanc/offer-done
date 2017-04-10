package org.offer.case18;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 18：树的子结构
 * Created by tanc on 2017/3/30.
 */
public class SubStructureInTree {

    /**
     * 递归遍历被搜索的树的所有结点，出现与子树根节点相同的结点 就继续比较他们的子树
     */
    public static <T> boolean hasSubTree(BinaryTreeNode<T> tree, BinaryTreeNode<T> sub) {

        boolean result = false;

        if (null != tree && null != sub) {
            if (tree.equals(sub)) {
                result = compare(tree, sub);
            }
            if (!result) {
                result = hasSubTree(tree.left, sub) || hasSubTree(tree.right, sub);
            }
        }

        return result;
    }

    private static <T> boolean compare(BinaryTreeNode<T> tree, BinaryTreeNode<T> sub) {

        if (null == sub) {
            return true;
        }
        if (null == tree) {
            return false;
        }

        if (!tree.data.equals(sub.data)) {
            return false;
        }

        return compare(tree.left, sub.left) && compare(tree.right, sub.right);
    }
}
