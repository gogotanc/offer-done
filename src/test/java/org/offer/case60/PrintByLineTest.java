package org.offer.case60;

import org.junit.Test;
import org.offer.utils.BinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 60: 把二叉树打印成多行
 * Created by tanc on 2017/7/13.
 */
public class PrintByLineTest {

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
        PrintByLine.methodOne(tree.getRoot());
    }

}