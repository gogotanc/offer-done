package org.offer.case25;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 25：二叉树中和为某一值的路径
 * Created by tanc on 2017/4/12.
 */
public class FindPathTest {

    @Test
    public void case1() throws Exception {

        BinaryTree<Integer> tree =  new BinaryTree<>(47);

        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(8);
        tree.addRandom(3);
        tree.addRandom(2);
        tree.addRandom(9);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        FindPath.findPath(tree.getRoot(), 22);

    }

    @Test
    public void case2() throws Exception {

        BinaryTree<Integer> tree =  new BinaryTree<>(47);

        tree.addRandom(1);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(7);
        tree.addRandom(10);
        tree.addRandom(11);
        tree.addRandom(12);
        tree.addRandom(6);
        tree.addRandom(8);
        tree.addRandom(3);
        tree.addRandom(2);
        tree.addRandom(9);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        FindPath.findPath(tree.getRoot(), 17);

    }

}