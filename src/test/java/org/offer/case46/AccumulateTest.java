package org.offer.case46;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 46: 求 1 + 2 + 3 + ... + n
 * Created by tanc on 2017/7/6.
 */
public class AccumulateTest {

    @Test
    public void methodOne() throws Exception {
        int result = Accumulate.methodOne(100);
        assertEquals(5050, result);
    }

}