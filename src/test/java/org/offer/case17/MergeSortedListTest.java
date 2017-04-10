package org.offer.case17;

import org.junit.Before;
import org.junit.Test;
import org.offer.utils.node.Node;
import org.offer.utils.SinglyLinkedList;

/**
 * 面试题 17：合并两个排序的链表
 * Created by tanc on 2017/3/30.
 */
public class MergeSortedListTest {

    private SinglyLinkedList<Integer> listOne;
    private SinglyLinkedList<Integer> listTwo;

    @Before
    public void before() {
        listOne = new SinglyLinkedList<>();
        listTwo = new SinglyLinkedList<>();
    }

    @Test
    public void case1() throws Exception {

        listOne.add(1);
        listOne.add(3);
        listOne.add(5);
        listOne.add(7);

        listTwo.add(2);
        listTwo.add(4);
        listTwo.add(6);
        listTwo.add(8);

        Node<Integer> node = MergeSortedList.merge(listOne.getHead(), listTwo.getHead());
        print(node);
    }

    @Test
    public void case2() throws Exception {

        listOne.add(1);

        listTwo.add(2);
        listTwo.add(4);
        listTwo.add(6);
        listTwo.add(8);

        Node<Integer> node = MergeSortedList.merge(listOne.getHead(), listTwo.getHead());
        print(node);
    }

    @Test
    public void case3() throws Exception {

        listTwo.add(2);

        Node<Integer> node = MergeSortedList.merge(listOne.getHead(), listTwo.getHead());
        print(node);
    }

    private void print(Node<Integer> node) {
        if (null == node) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + ",");
            node = node.next;
        }
        System.out.println();
    }
}