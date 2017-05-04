package org.offer.case27;

import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.node.DuplexNode;

/**
 * 面试题 27: 二叉搜索树与双向链表
 * Created by tanc on 17-5-4.
 */
public class ConvertBinarySearchTree {

    public static <T> DuplexNode<T> convert(BinaryTreeNode<T> root) {

        return convert(root, false);
    }

    private static <T> DuplexNode<T> convert(BinaryTreeNode<T> node, boolean isLeft) {

        if (null == node) {
            return null;
        }

        DuplexNode<T> root = new DuplexNode<>(node.data);
        DuplexNode<T> prev = convert(node.left, true);
        DuplexNode<T> next = convert(node.right, false);

        // connect three node
        root.next = next;
        root.prev = prev;
        if (null != prev) {
            prev.next = root;
        }
        if (null != next) {
            next.prev = root;
        }

        // choose result
        DuplexNode<T> result = root;
        if (isLeft) {
            while (null != result.next) {
                result = result.next;
            }
            return result;
        } else {
            while (null != result.prev) {
                result = result.prev;
            }
            return result;
        }
    }
}
