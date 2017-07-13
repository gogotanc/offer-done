package org.offer.case62;

import org.offer.utils.node.BinaryTreeNode;

/**
 * 面试题 62: 序列化二叉树
 * Created by tanc on 2017/7/12.
 */
public class SerializeBinaryTree {

    /**
     * 使用前序遍历，空节点使用特殊字符占位。
     */
    public static <E> String serialize(BinaryTreeNode<E> root) {
        if (null == root) {
            return null;
        }
        StringBuilder builder = new StringBuilder();

        a(root, builder);

        builder.deleteCharAt(builder.lastIndexOf(","));

        return builder.toString();
    }

    private static <E> void a(BinaryTreeNode<E> root, StringBuilder builder) {
        if (null == root) {
            builder.append("$,");
            return;
        }

        builder.append(root.data).append(",");

        a(root.left, builder);
        a(root.right, builder);
    }

    /**
     * 反序列化
     */
    public static BinaryTreeNode<Integer> deserialize(String string) throws Exception {

        if (null == string) {
            return null;
        }

        index = 0;

        String[] arr = string.split(",");

        BinaryTreeNode<Integer> result = deserialize(arr);

        index = 0;

        return result;
    }

    private static int index = 0;

    private static BinaryTreeNode<Integer> deserialize(String[] arr) {

        if (index >= arr.length) {
            return null;
        }

        String data = arr[index++];

        if (data.equals("$")) {
            return null;
        }

        Integer dataInt = Integer.parseInt(data);

        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(dataInt);

        node.left = deserialize(arr);
        node.right = deserialize(arr);
        return node;
    }

}
