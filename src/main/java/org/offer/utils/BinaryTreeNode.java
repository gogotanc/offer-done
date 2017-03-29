package org.offer.utils;

/**
 * 二叉树结点
 * Created by tanc on 2017/3/28.
 */
public class BinaryTreeNode<E> {

    public E data;
    public BinaryTreeNode<E> left;
    public BinaryTreeNode<E> right;

    public BinaryTreeNode(E data) {
        this(data, null, null);
    }

    public BinaryTreeNode(E data, BinaryTreeNode<E> left, BinaryTreeNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
