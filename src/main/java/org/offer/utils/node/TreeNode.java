package org.offer.utils.node;

/**
 * 二叉树节点，有父指针
 * Created by tanc on 2017/7/12.
 */
public class TreeNode<E> {

    public E data;
    public TreeNode<E> father;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode(E data) {
        this(data, null, null, null);
    }

    public TreeNode(E data, TreeNode<E> father) {
        this(data, father, null, null);
    }

    public TreeNode(E data, TreeNode<E> father, TreeNode<E> left, TreeNode<E> right) {
        this.data = data;
        this.father = father;
        this.left = left;
        this.right = right;
    }
}
