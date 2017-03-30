package org.offer.case17;

import org.offer.utils.Node;

/**
 * 面试题 17：合并两个排序的链表
 * Created by tanc on 2017/3/30.
 */
public class MergeSortedList {

    public static <T extends Comparable<? super T>> Node<T> merge(Node<T> listOne, Node<T> listTwo) {

        Node<T> head = null;
        Node<T> tail = null;
        Node<T> one;
        Node<T> two;
        Node<T> temp;

        while (listOne != null && listTwo != null) {
            int result = listOne.data.compareTo(listTwo.data);
            if (result <= 0) {
                one = listOne;
                listOne = listOne.next;
                one.next = null;
                if (null == tail) {
                    head = one;
                    tail = one;
                } else {
                    temp = tail;
                    tail = one;
                    temp.next = tail;
                }
            } else {
                two = listTwo;
                listTwo = listTwo.next;
                two.next = null;
                if (null == tail) {
                    head = two;
                    tail = two;
                } else {
                    temp = tail;
                    tail = two;
                    temp.next = tail;
                }
            }
        }

        while (listOne != null) {
            one = listOne;
            listOne = listOne.next;
            one.next = null;
            if (null == tail) {
                head = one;
                tail = one;
            } else {
                temp = tail;
                tail = one;
                temp.next = tail;
            }
        }
        while (listTwo != null) {
            two = listTwo;
            listTwo = listTwo.next;
            two.next = null;
            if (null == tail) {
                head = two;
                tail = two;
            } else {
                temp = tail;
                tail = two;
                temp.next = tail;
            }
        }

        return head;
    }

}
