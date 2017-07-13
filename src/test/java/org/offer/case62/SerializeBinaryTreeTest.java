package org.offer.case62;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 62: 序列化二叉树
 * Created by tanc on 2017/7/13.
 */
public class SerializeBinaryTreeTest {

    @Test
    public void serialize() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(47);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(7);
        tree.addRandom(8);
        tree.addRandom(9);
        tree.addRandom(10);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        PrintBinaryTree.printByLine(tree.getRoot());

        String result = SerializeBinaryTree.serialize(tree.getRoot());
        System.out.println(result);

    }

    @Test
    public void deserialize() throws Exception {
        String data = "1,2,5,$,$,4,$,8,$,9,$,$,3,6,$,$,7,$,10,$,$";
        BinaryTreeNode<Integer> root = SerializeBinaryTree.deserialize(data);
        PrintBinaryTree.printByLine(root);
    }

}