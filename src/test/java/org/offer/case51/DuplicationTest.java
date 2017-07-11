package org.offer.case51;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 51: 数组中重复的数字
 * Created by tanc on 2017/7/11.
 */
public class DuplicationTest {

    @Test
    public void case1() throws Exception {
        int[] data = new int[]{1, 2, 3, 4, 0, 2};
        int result = Duplication.methodOne(data);
        assertEquals(2, result);
    }

}