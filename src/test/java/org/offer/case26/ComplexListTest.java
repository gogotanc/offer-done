package org.offer.case26;

import org.junit.Test;

/**
 * 面试题 26: 复杂链表的复制
 * Created by tanc on 17-5-3.
 */
public class ComplexListTest {


    @Test
    public void cloneMethodOne() throws Exception {

        ComplexListNode node1 = new ComplexListNode(1, null);
        ComplexListNode node2 = new ComplexListNode(2, node1);
        ComplexListNode node3 = new ComplexListNode(3, node2);
        ComplexListNode node4 = new ComplexListNode(4, node3);
        ComplexListNode node5 = new ComplexListNode(5, node4);
        ComplexListNode node6 = new ComplexListNode(6, node5);
        ComplexListNode node7 = new ComplexListNode(7, node6);

        node7.sibling = node3;
        node6.sibling = null;
        node5.sibling = node1;
        node4.sibling = node2;
        node3.sibling = node6;
        node2.sibling = node7;
        node1.sibling = node4;

        // ComplexListNode cloneNode = ComplexList.cloneMethodOne(node7);
        // ComplexListNode cloneNode = ComplexList.cloneMethodTwo(node7);
        ComplexListNode cloneNode = ComplexList.cloneMethodThree(node7);

        printComplexList(cloneNode);
    }

    private void printComplexList(ComplexListNode cloneNode) {
        ComplexListNode temp = cloneNode;
        while (null != temp) {
            if (null != temp.sibling) {
                System.out.print(temp.data + " => " + temp.sibling.data);
            } else {
                System.out.print(temp.data + " => null");
            }
            System.out.println();
            temp = temp.next;
        }
    }

}