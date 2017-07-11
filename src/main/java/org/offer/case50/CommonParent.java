package org.offer.case50;

import org.offer.utils.node.BinaryTreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * 面试题 50: 树中两个节点的最低公共祖先
 * Created by tanc on 2017/7/11.
 */
public class CommonParent {

    /**
     * 这里描述书上的第三种情况，普通二叉树，没有父指针
     * 先找到从根节点到两个节点的链表，然后问题就成了寻找两个链表的最后一个公共节点
     */
    public static <E> BinaryTreeNode<E> methodOne(BinaryTreeNode<E> root, BinaryTreeNode<E> one, BinaryTreeNode<E> two) {

        BinaryTreeNode<E> result;
        List<BinaryTreeNode<E>> listOne = new LinkedList<>();
        List<BinaryTreeNode<E>> listTwo = new LinkedList<>();

        boolean flag = findList(root, one, listOne);
        if (!flag) {
            return null;
        }
        flag = findList(root, two, listTwo);
        if (!flag) {
            return null;
        }

        result = commonNode(listOne, listTwo);

        return result;
    }

    /**
     * 寻找两个链表的最后一个公共节点
     */
    private static <E> BinaryTreeNode<E> commonNode(List<BinaryTreeNode<E>> listOne, List<BinaryTreeNode<E>> listTwo) {
        Iterator<BinaryTreeNode<E>> it1 = listOne.iterator();
        Iterator<BinaryTreeNode<E>> it2 = listTwo.iterator();
        BinaryTreeNode<E> result = null;

        while (it1.hasNext() && it2.hasNext()) {
            BinaryTreeNode<E> temp = it1.next();
            boolean flag = Objects.equals(temp.data, it2.next().data);
            if (flag) {
                result = temp;
            } else {
                return result;
            }
        }

        return result;
    }

    /**
     * 寻找从 root 到 node 节点的链表
     */
    private static <E> boolean findList(BinaryTreeNode<E> root, BinaryTreeNode<E> node, List<BinaryTreeNode<E>> list) {

        if (null == root) {
            return false;
        }

        boolean flag;
        list.add(root);
        if (root.data.equals(node.data)) {
            return true;
        } else {
            flag = findList(root.left, node, list) || findList(root.right, node, list);
        }

        if (!flag) {
            list.remove(root);
        }
        return flag;
    }

}
