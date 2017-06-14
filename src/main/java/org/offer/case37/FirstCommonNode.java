package org.offer.case37;

import org.offer.utils.Stack;
import org.offer.utils.node.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 面试题 37：两个链表的第一个公共节点
 * Created by tanc on 17-6-14.
 */
public class FirstCommonNode {

    /**
     * 方法一：使用 hash
     */
    public static <E> Node<E> methodOne(Node<E> listOne, Node<E> listTwo) {
        if (!checkData(listOne, listTwo)) {
            return null;
        }
        Map<E, Node<E>> map = new HashMap<>();
        Node<E> temp = listOne;
        while (null != temp) {
            map.put(temp.data, temp);
            temp = temp.next;
        }
        temp = listTwo;
        while (null != temp) {
            Node<E> result = map.get(temp.data);
            if (null != result) {
                return result;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 方法二：使用栈
     */
    public static <E> Node<E> methodTwo(Node<E> listOne, Node<E> listTwo) {
        if (!checkData(listOne, listTwo)) {
            return null;
        }
        Stack<Node<E>> stackOne = new Stack<>();
        Stack<Node<E>> stackTwo = new Stack<>();
        Node<E> temp = listOne;
        while (null != temp) {
            stackOne.push(temp);
            temp = temp.next;
        }
        temp = listTwo;
        while (null != temp) {
            stackTwo.push(temp);
            temp = temp.next;
        }
        Node<E> result = null;
        while (!stackOne.isEmpty() && !stackTwo.isEmpty()) {
            Node<E> t = stackOne.pop();
            Node<E> p = stackTwo.pop();
            if (!Objects.equals(t.data, p.data)) {
                return result;
            }
            result = t;
        }
        return result;
    }

    /**
     * 方法三：使用书上第三种思路，长的链表先走几步，然后依次比较
     */
    public static <E> Node<E> methodThree(Node<E> listOne, Node<E> listTwo) {
        if (!checkData(listOne, listTwo)) {
            return null;
        }
        int listOneLength = getLength(listOne);
        Node<E> listOneTemp = listOne;
        int listTwoLength = getLength(listTwo);
        Node<E> listTwoTemp = listTwo;
        if (listOneLength > listTwoLength) {
            for (int i = 0; i < listOneLength - listTwoLength; i++) {
                listOneTemp = listOneTemp.next;
            }
        } else {
            for (int i = 0; i < listTwoLength - listOneLength; i++) {
                listTwoTemp = listTwoTemp.next;
            }
        }
        while (null != listOneTemp && null != listTwoTemp) {
            if (Objects.equals(listOneTemp.data, listTwoTemp.data)) {
                return listOneTemp;
            } else {
                listOneTemp = listOneTemp.next;
                listTwoTemp = listTwoTemp.next;
            }
        }
        return null;
    }

    private static int getLength(Node list) {
        int length = 1;
        Node temp = list;
        while (null != temp.next) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private static <E> boolean checkData(Node<E> l1, Node<E> l2) {
        return !(null == l1 || null == l2);
    }
}
