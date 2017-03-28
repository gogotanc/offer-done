package org.offer.case06;

/**
 * 打印二叉树
 * Created by tanc on 2017/3/28.
 */
public class PrintBinaryTree {

    public static void inOrder(BinaryTreeNode root) {
        System.out.println("中序遍历：");
        inOrderPrint(root);
        System.out.println();
    }

    private static void inOrderPrint(BinaryTreeNode root) {
        if (null == root) {
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data);
        System.out.print(",");
        inOrderPrint(root.right);
    }

    public static void preOrder(BinaryTreeNode root) {
        System.out.println("前序遍历：");
        preOrderPrint(root);
        System.out.println();
    }

    private static void preOrderPrint(BinaryTreeNode root) {
        if (null == root) {
            return;
        }
        System.out.print(root.data);
        System.out.print(",");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    public static void postOrder(BinaryTreeNode root) {
        System.out.println("后序遍历：");
        postOrderPrint(root);
        System.out.println();
    }

    private static void postOrderPrint(BinaryTreeNode root) {
        if (null == root) {
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data);
        System.out.print(",");
    }
}
