package org.offer.case44;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 44: 扑克牌的顺子
 * Created by tanc on 2017/7/6.
 */
public class IsContinuousTest {

    @Test
    public void methodOne() throws Exception {
        boolean result = IsContinuous.methodOne(new int[]{5, 4, 3, 2, 1});
        assertEquals(true, result);
    }

    @Test
    public void case1() throws Exception {
        boolean result = IsContinuous.methodOne(new int[]{8, 4, 3, 2, 1});
        assertEquals(false, result);
    }

    @Test
    public void case2() throws Exception {
        boolean result = IsContinuous.methodOne(new int[]{6, 4, 3, 2, 1, 0});
        assertEquals(true, result);
    }

    @Test
    public void case3() throws Exception {
        boolean result = IsContinuous.methodOne(new int[]{5, 4, 3, 2, 1, 0, 0, 0});
        assertEquals(true, result);
    }

    @Test
    public void case4() throws Exception {
        boolean result = IsContinuous.methodOne(new int[]{4, 4, 3, 2, 1, 0});
        assertEquals(false, result);
    }

}