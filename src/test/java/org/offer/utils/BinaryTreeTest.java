package org.offer.utils;

import org.junit.Test;
import org.offer.utils.print.PrintBinaryTree;

/**
 * 普通二叉树
 * Created by tanc on 2017/3/30.
 */
public class BinaryTreeTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        PrintBinaryTree.postOrder(tree.getRoot());
    }

    @Test
    public void case2() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(47);

        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        PrintBinaryTree.postOrder(tree.getRoot());
    }
}