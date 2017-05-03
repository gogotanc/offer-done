package org.offer.case26;

/**
 * 复杂链表的节点
 * Created by tanc on 17-5-3.
 */
public class ComplexListNode {

    int data;
    ComplexListNode next;
    ComplexListNode sibling;

    public ComplexListNode(int data) {
        this(data, null, null);
    }

    public ComplexListNode(int data, ComplexListNode next) {
        this(data, next, null);
    }

    public ComplexListNode(int data, ComplexListNode next, ComplexListNode sibling) {
        this.data = data;
        this.next = next;
        this.sibling = sibling;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //
    //     // super.clone();
    //
    //     ComplexListNode cloneNode = new ComplexListNode(data);
    //
    //     if (null == next) {
    //         cloneNode.next = null;
    //     } else {
    //         cloneNode.next = (ComplexListNode) next.clone();
    //     }
    //     if (null == sibling) {
    //         cloneNode.sibling = null;
    //     } else {
    //         cloneNode.sibling = (ComplexListNode) sibling.clone();
    //     }
    //
    //     return cloneNode;
    // }
}
