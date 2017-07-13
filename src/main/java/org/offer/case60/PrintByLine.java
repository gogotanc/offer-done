package org.offer.case60;

import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题 60: 把二叉树打印成多行
 * Created by tanc on 2017/7/12.
 */
public class PrintByLine {

    public static <E> void methodOne(BinaryTreeNode<E> root) {

        Queue<BinaryTreeNode<E>> queue = new LinkedList<>();

        queue.add(root);
        int currentLevel = 1;
        int nextLevel = 0;

        while (!queue.isEmpty()) {
            BinaryTreeNode<E> temp = queue.peek();

            if (null != temp.left) {
                queue.add(temp.left);
                nextLevel++;
            }

            if (null != temp.right) {
                queue.add(temp.right);
                nextLevel++;
            }

            temp = queue.poll();
            System.out.print(temp.data + " ");
            currentLevel--;

            if (currentLevel == 0) {
                System.out.println();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }
}
