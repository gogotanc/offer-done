package org.offer.case63;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 63: 二叉搜索树的第 K 个节点
 * Created by tanc on 2017/7/13.
 */
public class BinaryTreeKthTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(17);
        tree.addRandom(3);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(4);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        BinaryTreeNode<Integer> result = BinaryTreeKth.methodOne(tree.getRoot(), 1);
        assertEquals(1, result.data.intValue());

        result = BinaryTreeKth.methodOne(tree.getRoot(), 2);
        assertEquals(2, result.data.intValue());

        result = BinaryTreeKth.methodOne(tree.getRoot(), 3);
        assertEquals(3, result.data.intValue());
    }

}