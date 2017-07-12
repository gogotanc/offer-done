package org.offer.case52;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 52: 构建乘积数组
 * Created by tanc on 2017/7/12.
 */
public class MultiplyTest {

    @Test
    public void case1() throws Exception {
        int[] data = new int[]{1, 2, 3, 4};
        int[] result = Multiply.methodOne(data);
        assertNotNull(result);
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

}