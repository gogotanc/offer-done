package org.offer.utils;

import java.util.Random;

/**
 * 普通二叉树
 * Created by tanc on 2017/3/30.
 */
public class BinaryTree<E> {

    private BinaryTreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    public void addRandom(E data) {
        root = addRandom(root, data);
    }

    private BinaryTreeNode<E> addRandom(BinaryTreeNode<E> node, E data) {
        if (null == node) {
            return new BinaryTreeNode<>(data);
        }

        Random random = new Random(System.nanoTime());
        int result = random.nextInt();
        if ((result & 1) == 1) {
            node.left = addRandom(node.left, data);
        } else {
            node.right = addRandom(node.right, data);
        }
        return node;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}
