package org.offer.case06;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 6：重建二叉树
 * Created by tanc on 2017/3/28.
 */
public class BuildTree {

    public static BinaryTreeNode<Integer> rebuildTree(int[] preOrder, int[] inOrder) {

        if (preOrder.length != inOrder.length) {
            throw new RuntimeException("输入非法。");
        } else if (preOrder.length == 0) {
            return null;
        }

        return rebuild(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static BinaryTreeNode<Integer> rebuild(int[] preOrder, int preBegin, int preEnd, int[] inOrder, int inBegin, int inEnd) {

        if (inBegin > inEnd || preBegin > preEnd) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[preBegin]);

        // 左子树的节点数
        int count = 0;

        for (int index = inBegin; index <= inEnd; index++) {
            if (inOrder[index] == root.data) {
                break;
            }
            count++;
        }

        root.left = rebuild(preOrder, preBegin + 1, preBegin + count, inOrder, inBegin, inBegin + count - 1);
        root.right = rebuild(preOrder, preBegin + count + 1, preEnd, inOrder, inBegin + count + 1, inEnd);

        return root;
    }
}
