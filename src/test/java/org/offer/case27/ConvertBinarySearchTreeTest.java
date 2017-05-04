package org.offer.case27;

import org.junit.Test;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.node.DuplexNode;
import org.offer.utils.print.PrintBinaryTree;
import org.offer.utils.print.PrintDuplexList;

/**
 * 面试题 27: 二叉搜索树与双向链表
 * Created by tanc on 17-5-4.
 */
public class ConvertBinarySearchTreeTest {

    private BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
    private BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
    private BinaryTreeNode<Integer> node9 = new BinaryTreeNode<>(9);
    private BinaryTreeNode<Integer> node10 = new BinaryTreeNode<>(10);
    private BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
    private BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
    private BinaryTreeNode<Integer> node13 = new BinaryTreeNode<>(13);

    @Test
    public void case1() throws Exception {
        // 都没有左子节点的情况

        node10.right = node12;
        node12.right = node13;
        PrintBinaryTree.inOrder(node10);

        DuplexNode<Integer> temp = ConvertBinarySearchTree.convert(node10);
        PrintDuplexList.inOrder(temp);
    }

    @Test
    public void case2() throws Exception {
        // 都没有右子节点的情况

        node10.left = node8;
        node8.left = node7;
        PrintBinaryTree.inOrder(node10);

        DuplexNode<Integer> temp = ConvertBinarySearchTree.convert(node10);
        PrintDuplexList.inOrder(temp);
    }

    @Test
    public void case3() throws Exception {
        // 输入 null

        PrintBinaryTree.inOrder(null);

        DuplexNode<Integer> temp = ConvertBinarySearchTree.convert(null);
        PrintDuplexList.inOrder(temp);
    }

    @Test
    public void case4() throws Exception {
        // 完全二叉树的情况

        node10.left = node8;
        node10.right = node12;
        node8.left = node7;
        node8.right = node9;
        node12.left = node11;
        node12.right = node13;
        PrintBinaryTree.inOrder(node10);

        DuplexNode<Integer> temp = ConvertBinarySearchTree.convert(node10);
        PrintDuplexList.inOrder(temp);
    }
}