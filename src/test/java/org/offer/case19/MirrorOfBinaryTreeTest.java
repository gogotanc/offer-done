package org.offer.case19;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.print.PrintBinaryTree;

/**
 * 面试题 19：二叉树的镜像
 * Created by tanc on 2017/4/6.
 */
public class MirrorOfBinaryTreeTest {

    @Test
    public void case1() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(47);
        tree.addRandom(0);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        // 中序遍历结果为：[4,1,3,0,2]
        // 前序遍历结果为：[0,1,4,3,2]

        MirrorOfBinaryTree.mirror(tree.getRoot());

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        // 中序遍历结果为：[2,0,3,1,4]
        // 前序遍历结果为：[0,2,1,3,4]
    }

    @Test
    public void case2() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>();

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        MirrorOfBinaryTree.mirror(tree.getRoot());

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
    }

    @Test
    public void case3() throws Exception {

        // 只有左子树的二叉树
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(0, new BinaryTreeNode<>(1, new BinaryTreeNode<>(2, new BinaryTreeNode<>(3), null), null), null);

        PrintBinaryTree.inOrder(root);
        PrintBinaryTree.preOrder(root);

        MirrorOfBinaryTree.mirror(root);

        PrintBinaryTree.inOrder(root);
        PrintBinaryTree.preOrder(root);
    }

}