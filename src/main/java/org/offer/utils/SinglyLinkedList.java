package org.offer.utils;

/**
 * 单向链表
 * Created by tanc on 2017/3/29.
 */
public class SinglyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(E data) {
        Node<E> temp = tail;
        tail = new Node<>(data);
        if (null == temp) {
            head = tail;
        } else {
            temp.next = tail;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public void remove(E data) {
//        if (size() == 0) {
//            return;
//        }
//        Node<E> p = null;
//        Node<E> temp = head;
//        while (temp.next != null) {
//            p = temp;
//            temp = temp.next;
//            if (temp.data == data) {
//                p.next = temp.next;
//                size--;
//            }
//        }
//    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print(",");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> node) {
        head = node;

        // 还要设置尾结点
        if (null == node) {
            tail = null;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }
}
