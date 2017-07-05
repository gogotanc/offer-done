package org.offer.case39;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 39
 * 题目二 : 判断一颗二叉树是否为平衡的
 * Created by tanc on 2017/7/5.
 */
public class IsBalanced {

    /**
     * 方法一：借鉴求树深度，判断该树是否为平衡二叉树
     */
    public static <E> boolean methodOne(BinaryTreeNode<E> root) {
        return null != root && isBalanced(root);
    }

    private static <E> boolean isBalanced(BinaryTreeNode<E> root) {
        if (null == root) {
            return true;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);

        int diff = left - right;
        if (diff > 1 || diff < -1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 递归求树深度
     */
    private static <E> int treeDepth(BinaryTreeNode<E> root) {
        if (null == root) {
            return 0;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    /**
     * 方法二：使用后续遍历，每个节点添加一个深度属性
     */
    public static <E> boolean methodTwo(BinaryTreeNode<E> root) {
        if (null == root) {
            return false;
        }
        Node<E> node = new Node<>(root, 0);
        return isBalanced(node);
    }

    private static <E> boolean isBalanced(Node<E> node) {

        if (null == node.node) {
            node.depth = 0;
            return true;
        }

        Node<E> leftNode = new Node<>(node.node.left, 0);
        Node<E> rightNode = new Node<>(node.node.right, 0);

        if (isBalanced(leftNode) && isBalanced(rightNode)) {
            int diff = leftNode.depth - rightNode.depth;
            if (diff <= 1 && diff >= -1) {
                node.depth = leftNode.depth > rightNode.depth ? leftNode.depth + 1 : rightNode.depth + 1;
                return true;
            }
        }
        return false;
    }

    /**
     * 把 BinaryTreeNode 封装一下，添加一个深度属性
     */
    private static class Node<T> {
        BinaryTreeNode<T> node;
        int depth;

        public Node(BinaryTreeNode<T> node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

}
