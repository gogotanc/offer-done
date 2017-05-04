package org.offer.case27;

import org.junit.Test;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.node.DuplexNode;
import org.offer.utils.print.PrintBinaryTree;

/**
 * 面试题 27: 二叉搜索树与双向链表
 * Created by tanc on 17-5-4.
 */
public class ConvertBinarySearchTreeTest {

    @Test
    public void convert() throws Exception {

        BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> node9 = new BinaryTreeNode<>(9);
        BinaryTreeNode<Integer> node10 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
        BinaryTreeNode<Integer> node13 = new BinaryTreeNode<>(13);

        node10.left = node8;
        node10.right = node12;
        node8.left = node7;
        node8.right = node9;
        node12.left = node11;
        node12.right = node13;

        PrintBinaryTree.inOrder(node10);

        DuplexNode<Integer> temp = ConvertBinarySearchTree.convert(node10);
        System.out.print("双向链表打印如下：");
        while (null != temp) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }

}