package org.offer.case61;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 61: 按之字形顺序打印二叉树
 * Created by tanc on 2017/7/13.
 */
public class PrintBySTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(47);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(7);
        PrintBinaryTree.printByLine(tree.getRoot());
        System.out.println("之字形打印：");
        PrintByS.methodOne(tree.getRoot());
    }

}