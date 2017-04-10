package org.offer.case23;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.print.PrintBinaryTree;

/**
 * 面试题 23：
 * Created by tanc on 2017/4/10.
 */
public class PrintTreeTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(47);

        tree.addRandom(0);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        PrintTree.printFromTopToBottom(tree.getRoot());
    }

}