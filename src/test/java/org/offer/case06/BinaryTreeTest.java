package org.offer.case06;

import org.junit.Test;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.print.PrintBinaryTree;

/**
 * 面试题 6：重建二叉树
 * Created by tanc on 2017/3/28.
 */
public class BinaryTreeTest {

    @Test
    public void test() {

        BinaryTreeNode root = BuildTree.rebuildTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});

        PrintBinaryTree.inOrder(root);
        PrintBinaryTree.preOrder(root);
        PrintBinaryTree.postOrder(root);
    }
}