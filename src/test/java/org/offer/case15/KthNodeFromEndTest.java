package org.offer.case15;

import org.junit.Test;
import org.offer.utils.Node;
import org.offer.case05.PrintList;
import org.offer.utils.SinglyLinkedList;

/**
 * 面试题 15：链表中倒数第 K 个结点
 * Created by tanc on 2017/3/29.
 */
public class KthNodeFromEndTest {

    @Test
    public void get() throws Exception {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        Node result = KthNodeFromEnd.get(list.getHead(), 5);
        if (null != result) {
            System.out.println(result.data);
        }
    }
}