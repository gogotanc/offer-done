package org.offer.utils;

/**
 * 单向链表
 * Created by tanc on 2017/3/29.
 */
public class SinglyLinkedList<E> implements List<E> {

    private Node<E> head;
    private int size;

    public SinglyLinkedList() {
        head = new Node<>();
        size = 0;
    }

    @Override
    public void add(E data) {
        head.next = new Node<>(data, head.next);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(E data) {
        if (size() == 0) {
            return;
        }
        Node<E> p = null;
        Node<E> temp = head;
        while (temp.next != null) {
            p = temp;
            temp = temp.next;
            if (temp.data == data) {
                p.next = temp.next;
                size--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(temp.data);
            System.out.print(",");
        }
        System.out.println();
    }

    public Node<E> getHead() {
        return head;
    }
}
