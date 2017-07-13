package org.offer.case61;

import org.offer.utils.Stack;
import org.offer.utils.node.BinaryTreeNode;

import java.util.ArrayList;

/**
 * 面试题 61: 按之字形顺序打印二叉树
 * Created by tanc on 2017/7/12.
 */
public class PrintByS {

    /**
     * 使用两个栈来存放奇数层和偶数层的节点
     *
     * 使用 ArrayList 当成数组
     * 以为 Java 中没有泛型数组
     */
    public static <E> void methodOne(BinaryTreeNode<E> root) {

        int level = 1;
        ArrayList<Stack<BinaryTreeNode<E>>> stacks = new ArrayList<>();

        stacks.add(new Stack<>());
        stacks.add(new Stack<>());

        int currentIndex = level & 1;
        int nextIndex = currentIndex ^ 1;
        stacks.get(currentIndex).push(root);

        while (!stacks.get(currentIndex).isEmpty()) {
            BinaryTreeNode<E> temp = stacks.get(currentIndex).pop();

            if (currentIndex == 1) {
                if (null != temp.left) {
                    stacks.get(nextIndex).push(temp.left);
                }
                if (null != temp.right) {
                    stacks.get(nextIndex).push(temp.right);
                }
            } else {
                if (null != temp.right) {
                    stacks.get(nextIndex).push(temp.right);
                }
                if (null != temp.left) {
                    stacks.get(nextIndex).push(temp.left);
                }
            }

            System.out.print(temp.data + " ");

            if (stacks.get(currentIndex).isEmpty()) {
                System.out.println();
                level++;
                currentIndex = level & 1;
                nextIndex = currentIndex ^ 1;
            }
        }
    }

}
