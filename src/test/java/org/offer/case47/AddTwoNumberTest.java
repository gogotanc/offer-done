package org.offer.case47;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 47: 不使用加减乘除做加法
 * Created by tanc on 2017/7/6.
 */
public class AddTwoNumberTest {

    @Test
    public void methodOne() throws Exception {
        int result = AddTwoNumber.methodOne(0, 0);
        assertEquals(0, result);
    }

}