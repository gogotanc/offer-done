package org.offer.case21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 21：包含 min 函数的栈
 * Created by tanc on 2017/4/6.
 */
public class StackWithMinTest {

    @Test
    public void case1() throws Exception {
        StackWithMin<Integer> stack = new StackWithMin<>();

        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);

        assertEquals(1, stack.min().intValue());

        stack.pop();
        assertEquals(1, stack.min().intValue());

        stack.pop();
        assertEquals(2, stack.min().intValue());

        stack.push(0);
        assertEquals(0, stack.min().intValue());
    }

}