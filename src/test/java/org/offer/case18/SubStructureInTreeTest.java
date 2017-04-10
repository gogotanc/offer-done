package org.offer.case18;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 18：树的子结构
 * Created by tanc on 2017/3/30.
 */
public class SubStructureInTreeTest {

    @Test
    public void hasSubTree() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(47);
        BinaryTree<Integer> sub = new BinaryTree<>(43);

        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);

        sub.addRandom(2);
        sub.addRandom(4);

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        PrintBinaryTree.inOrder(sub.getRoot());
        PrintBinaryTree.preOrder(sub.getRoot());

        assertEquals(true, SubStructureInTree.hasSubTree(tree.getRoot(), sub.getRoot()));
    }

    @Test
    public void case2() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(47);
        BinaryTree<Integer> sub = new BinaryTree<>(41);

        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(7);

        // 中序遍历结果为：[5,2,4,7,1,4,3,5]
        // 前序遍历结果为：[1,2,5,4,7,3,4,5]

        sub.addRandom(3);
        sub.addRandom(4);
        // 中序遍历结果为：[4,3]
        // 前序遍历结果为：[3,4]

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        PrintBinaryTree.inOrder(sub.getRoot());
        PrintBinaryTree.preOrder(sub.getRoot());

        assertEquals(true, SubStructureInTree.hasSubTree(tree.getRoot(), sub.getRoot()));
    }

    @Test
    public void case3() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(47);
        BinaryTree<Integer> sub = new BinaryTree<>(13);

        assertEquals(false, SubStructureInTree.hasSubTree(tree.getRoot(), sub.getRoot()));
    }

    @Test
    public void case4() throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(47);
        BinaryTree<Integer> sub = new BinaryTree<>(11);

        tree.addRandom(1);
        tree.addRandom(8);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(7);
        tree.addRandom(8);
        tree.addRandom(9);
        tree.addRandom(0);
        // 中序遍历结果为：[5,8,4,8,9,1,6,3,7,0]
        // 前序遍历结果为：[1,8,5,4,8,9,3,6,7,0]

        sub.addRandom(8);
        sub.addRandom(5);
        sub.addRandom(4);
        // 中序遍历结果为：[5,8,4]
        // 前序遍历结果为：[8,5,4]

        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());

        PrintBinaryTree.inOrder(sub.getRoot());
        PrintBinaryTree.preOrder(sub.getRoot());

        assertEquals(true, SubStructureInTree.hasSubTree(tree.getRoot(), sub.getRoot()));
    }
}