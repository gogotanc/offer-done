package org.offer.case59;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 59: 对称的二叉树
 * Created by tanc on 2017/7/13.
 */
public class SymmetryTreeTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(33);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(3);
        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        boolean result = SymmetryTree.methodOne(tree.getRoot());
        assertEquals(true, result);

        tree.addRandom(4);
        result = SymmetryTree.methodOne(tree.getRoot());
        assertEquals(false, result);
    }

}