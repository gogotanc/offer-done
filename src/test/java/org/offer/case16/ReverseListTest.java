package org.offer.case16;

import org.junit.Test;
import org.offer.utils.SinglyLinkedList;

import static org.junit.Assert.*;

/**
 * 面试题 16：反转链表
 * Created by tanc on 2017/3/29.
 */
public class ReverseListTest {

    @Test
    public void reverse() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        ReverseList.reverse(list.getHead());
        list.print();
    }

}