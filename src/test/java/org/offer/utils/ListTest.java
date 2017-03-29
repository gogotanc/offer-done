package org.offer.utils;

import org.junit.Test;
import org.offer.case05.PrintList;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * 工具类相关测试
 * Created by tanc on 2017/3/29.
 */
public class ListTest {

    @Test
    public void add() throws Exception {

        List<Integer> list = new SinglyLinkedList<>();
        list.add(2);
        list.add(5);
        list.print();
        list.remove(5);
        list.print();
    }

}