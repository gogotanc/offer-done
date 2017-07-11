package org.offer.case50;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;

import static org.junit.Assert.*;

/**
 * 面试题 50: 树中两个节点的最低公共祖先
 * Created by tanc on 2017/7/11.
 */
public class CommonParentTest {

    @Test
    public void case1() throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>(34);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        // 中序遍历结果为：[3,2,4,6,1,5]
        // 前序遍历结果为：[1,2,3,4,6,5]

        BinaryTreeNode<Integer> result =CommonParent.methodOne(tree.getRoot(), new BinaryTreeNode<>(3), new BinaryTreeNode<>(5));

        assertNotNull(result);
        assertEquals(1, result.data.intValue());
    }

}