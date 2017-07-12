package org.offer.case58;

import org.offer.utils.node.TreeNode;

/**
 * 面试题 58: 二叉树的下一个节点
 * Created by tanc on 2017/7/12.
 */
public class NextTreeNode {

    /**
     * 寻找中序遍历中，节点的下一个节点
     * 3 种情况
     * 有右子树，则下一节点为右子树最左子节点
     * 没有子树，有父亲节点，则为第一个不为右节点的节点的父亲节点
     * 没有右子树和父亲节点，则下一节点为空
     */
    public static <E> TreeNode<E> methodOne(TreeNode<E> node) {
        if (null == node) {
            return null;
        }

        TreeNode<E> result = null;
        TreeNode<E> temp;

        // 有右子树
        if (node.right != null) {
            temp = node.right;
            if (temp.left == null) {
                result = temp;
            } else {
                while (temp != null) {
                    result = temp;
                    temp = temp.left;
                }
            }
            return result;
        } else if (node.father != null) {
            // 右子树为空，有父亲节点
            temp = node;
            while (temp.father != null && isRightChild(temp)) {
                temp = temp.father;
            }
            return temp.father;
        } else {
            // 没右子树，也没父亲
            return null;
        }
    }

    /**
     * 判断一个节点是否为父亲节点的右子节点
     */
    private static <E> boolean isRightChild(TreeNode<E> node) {
        TreeNode<E> father = node.father;
        if (father.right == null) {
            return false;
        }
        return father.right.data.equals(node.data);
    }
}
