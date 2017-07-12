package org.offer.case58;

import org.junit.Test;
import org.offer.utils.node.TreeNode;

import static org.junit.Assert.*;

/**
 * 面试题 58: 二叉树的下一个节点
 * Created by tanc on 2017/7/12.
 */
public class NextTreeNodeTest {

    @Test
    public void case1() throws Exception {
        TreeNode<Integer> a = new TreeNode<>(1);
        TreeNode<Integer> b = new TreeNode<>(2);
        TreeNode<Integer> c = new TreeNode<>(3);
        TreeNode<Integer> d = new TreeNode<>(4);
        TreeNode<Integer> e = new TreeNode<>(5);
        TreeNode<Integer> f = new TreeNode<>(6);
        TreeNode<Integer> g = new TreeNode<>(7);
        TreeNode<Integer> h = new TreeNode<>(8);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;
        b.father = a;

        c.left = f;
        c.right = g;
        c.father = a;

        d.father = c;

        e.left = h;
        e.father = b;

        f.father = c;
        g.father = c;

        h.father = e;

        TreeNode<Integer> result = NextTreeNode.methodOne(g);
        assertNull(result);

        result = NextTreeNode.methodOne(a);
        assertEquals(6, result.data.intValue());

        result = NextTreeNode.methodOne(h);
        assertEquals(5, result.data.intValue());

    }

}