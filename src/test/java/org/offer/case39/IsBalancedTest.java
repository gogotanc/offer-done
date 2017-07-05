package org.offer.case39;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;

import static org.junit.Assert.*;

/**
 * 面试题 39
 * 题目二 : 判断一颗二叉树是否为平衡的
 * Created by tanc on 2017/7/5.
 */
public class IsBalancedTest {

    @Test
    public void case1() throws Exception {
        // 平衡二叉树
        BinaryTree<Integer> tree = new BinaryTree<>(47);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        // 中序遍历结果为：[2,1,3]
        // 前序遍历结果为：[1,2,3]
        boolean isBalanced = IsBalanced.methodOne(tree.getRoot());
        assertEquals(true, isBalanced);
        isBalanced = IsBalanced.methodTwo(tree.getRoot());
        assertEquals(true, isBalanced);
    }

    @Test
    public void case2() throws Exception {
        // 非平衡二叉树
        BinaryTree<Integer> tree = new BinaryTree<>(3);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(7);
        tree.addRandom(8);
        tree.addRandom(9);
        // 中序遍历结果为：[1,6,7,3,9,2,8,4,5]
        // 前序遍历结果为：[1,2,3,6,7,9,4,8,5]
        boolean isBalanced = IsBalanced.methodOne(tree.getRoot());
        assertEquals(false, isBalanced);
        isBalanced = IsBalanced.methodTwo(tree.getRoot());
        assertEquals(false, isBalanced);
    }

    @Test
    public void case3() throws Exception {
        // 二叉树所有节点都没有左子树
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> right1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right2 = new BinaryTreeNode<>(3);
        root.right = right1;
        right1.right = right2;

        boolean isBalanced = IsBalanced.methodOne(root);
        assertEquals(false, isBalanced);
        isBalanced = IsBalanced.methodTwo(root);
        assertEquals(false, isBalanced);
    }

    @Test
    public void case5() throws Exception {
        // 只有一个节点
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4);
        boolean isBalanced = IsBalanced.methodOne(root);
        assertEquals(true, isBalanced);
        isBalanced = IsBalanced.methodTwo(root);
        assertEquals(true, isBalanced);
    }
}