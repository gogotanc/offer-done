package org.offer.case22;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 22：栈的压入、弹出序列
 * Created by tanc on 2017/4/10.
 */
public class StackPushPopOrderTest {

    @Test
    public void case1() throws Exception {
        Integer[] pushOrder = {1, 2, 3, 4, 5};
        Integer[] popOrder = {4, 5, 3, 2, 1};
        assertEquals(true, StackPushPopOrder.isPopOrder(pushOrder, popOrder));
    }

    @Test
    public void case2() throws Exception {
        Integer[] pushOrder = {1, 2, 3, 4, 5};
        Integer[] popOrder = {4, 3, 5, 1, 2};
        assertEquals(false, StackPushPopOrder.isPopOrder(pushOrder, popOrder));
    }

    @Test
    public void case3() throws Exception {
        Integer[] pushOrder = {1};
        Integer[] popOrder = {4};
        assertEquals(false, StackPushPopOrder.isPopOrder(pushOrder, popOrder));
    }

    @Test
    public void case4() throws Exception {
        Integer[] pushOrder = {1};
        Integer[] popOrder = {1};
        assertEquals(true, StackPushPopOrder.isPopOrder(pushOrder, popOrder));
    }

    @Test
    public void case5() throws Exception {
        Integer[] pushOrder = null;
        Integer[] popOrder = null;
        assertEquals(false, StackPushPopOrder.isPopOrder(pushOrder, popOrder));
    }

}