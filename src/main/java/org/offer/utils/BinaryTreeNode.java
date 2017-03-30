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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryTreeNode<?> that = (BinaryTreeNode<?>) o;

        return data != null ? data.equals(that.data) : that.data == null;
    }

    // 下面使用的是 idea 自动生成的 equals 方法和 hashCode 方法

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BinaryTreeNode<?> that = (BinaryTreeNode<?>) o;
//
//        if (data != null ? !data.equals(that.data) : that.data != null) return false;
//        if (left != null ? !left.equals(that.left) : that.left != null) return false;
//        return right != null ? right.equals(that.right) : that.right == null;
//    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
