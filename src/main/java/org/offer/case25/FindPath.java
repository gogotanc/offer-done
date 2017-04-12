package org.offer.case25;

import org.offer.utils.node.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 25：二叉树中和为某一值的路径
 * Created by tanc on 2017/4/12.
 */
public class FindPath {

    public static void findPath(BinaryTreeNode<Integer> root, int expectSum) {
        if (null == root) {
            return;
        }
        List<Integer> path = new ArrayList<>();
        findPath(root, path, 0, expectSum);
    }

    private static void findPath(BinaryTreeNode<Integer> node, List<Integer> path, int sum, int expectSum) {

        if (null == node) {
            return;
        }
        path.add(node.data);
        sum += node.data;
        int startLen = path.size();

        if (sum == expectSum && isLeafNode(node)) {
            printPath(path);
        }

        findPath(node.left, path, sum, expectSum);

        if (startLen != path.size()) {
            path.remove(path.size() - 1);
        }

        findPath(node.right, path, sum, expectSum);

        if (startLen != path.size()) {
            path.remove(path.size() - 1);
        }
    }

    private static boolean isLeafNode(BinaryTreeNode<Integer> node) {
        return null == node.left && null == node.right;
    }

    private static void printPath(List<Integer> list) {
        StringBuilder buffer = new StringBuilder();
        for (Integer integer : list) {
            buffer.append(integer).append(",");
        }
        buffer.deleteCharAt(buffer.length() - 1);
        System.out.println(buffer.toString());
    }
}
