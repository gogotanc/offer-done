package org.offer.utils.print;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 打印二叉树
 * Created by tanc on 2017/3/28.
 */
public class PrintBinaryTree {

    private static final int IN_ORDER = 0;
    private static final int PRE_ORDER = 1;
    private static final int POST_ORDER = 2;

    /**
     * 中序遍历
     */
    public static void inOrder(BinaryTreeNode root) {
        System.out.print("中序遍历结果为：");
        print(root, IN_ORDER);
    }

    /**
     * 前序遍历
     */
    public static void preOrder(BinaryTreeNode root) {
        System.out.print("前序遍历结果为：");
        print(root, PRE_ORDER);
    }

    /**
     * 后序遍历
     */
    public static void postOrder(BinaryTreeNode root) {
        System.out.print("后序遍历结果为：");
        print(root, POST_ORDER);
    }

    public static void print(BinaryTreeNode root, int rule) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        print(root, builder, rule);
        if (builder.length() > 1) {
            // 去掉最后一个 ","
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append("]");
        System.out.println(builder.toString());
    }

    private static void print(BinaryTreeNode root, StringBuilder builder, int rule) {
        if (null == root) {
            return;
        }
        switch (rule) {
            case IN_ORDER:
                print(root.left, builder, rule);
                builder.append(root.data).append(",");
                print(root.right, builder, rule);
                break;
            case PRE_ORDER:
                builder.append(root.data).append(",");
                print(root.left, builder, rule);
                print(root.right, builder, rule);
                break;
            case POST_ORDER:
                print(root.left, builder, rule);
                print(root.right, builder, rule);
                builder.append(root.data).append(",");
                break;
            default:
                throw new RuntimeException("非法参数");
        }
    }
}
