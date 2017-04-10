package org.offer.case23;

import org.offer.case07.QueueByStack;
import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 23：从上到下打印二叉树
 * Created by tanc on 2017/4/10.
 */
public class PrintTree {

    /**
     * 使用一个队列实现二叉树从上到下打印
     */
    public static <T> void printFromTopToBottom(BinaryTreeNode<T> root) {

        if (null == root) {
            return;
        }

        QueueByStack<BinaryTreeNode<T>> queue = new QueueByStack<>();
        queue.appendTail(root);
        StringBuilder buffer = new StringBuilder();

        while (!queue.isEmpty()) {
            BinaryTreeNode<T> temp = queue.deleteHead();
            buffer.append(temp.data).append(",");
            if (null != temp.left) {
                queue.appendTail(temp.left);
            }
            if (null != temp.right) {
                queue.appendTail(temp.right);
            }
        }
        if (buffer.length() != 0) {
            buffer.deleteCharAt(buffer.length() - 1);
            System.out.println(buffer.toString());
        }
    }
}
