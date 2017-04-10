package org.offer.utils;

import org.offer.utils.node.BinaryTreeNode;

import java.util.Random;

/**
 * 普通二叉树
 * Created by tanc on 2017/3/30.
 */
public class BinaryTree<E> {

    private BinaryTreeNode<E> root;

    // 提供生成 随机 或 伪随机 的二叉树
    private Random random;

    public BinaryTree() {
        this(System.nanoTime());
    }

    public BinaryTree(long seed) {
        root = null;
        random = new Random(seed);
    }

    public void addRandom(E data) {
        root = addRandom(root, data);
    }

    public void addRandom(E data, long seed) {
        root = addRandom(root, data);
    }

    private BinaryTreeNode<E> addRandom(BinaryTreeNode<E> node, E data) {
        if (null == node) {
            return new BinaryTreeNode<>(data);
        }

        int result = random.nextInt();
        if ((result & 1) == 1) {
            node.left = addRandom(node.left, data);
        } else {
            node.right = addRandom(node.right, data);
        }
        return node;
    }

    public BinaryTreeNode<E> getRoot() {
        return root;
    }
}
