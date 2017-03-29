package org.offer.utils;

/**
 * 链表
 * Created by tanc on 2017/3/29.
 */
public interface List<E> {

    void add(E data);

    int size();

//    void remove(E data);

    boolean isEmpty();

    void print();
}
