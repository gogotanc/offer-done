package org.offer.case45;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 45: 圆圈中最后剩下的数字
 * Created by tanc on 2017/7/6.
 */
public class LastRemainingTest {

    @Test
    public void methodOne() throws Exception {
        int result = LastRemaining.methodOne(4, 2);
        assertEquals(0, result);
    }

}