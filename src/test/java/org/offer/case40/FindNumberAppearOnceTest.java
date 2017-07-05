package org.offer.case40;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 40: 数组中只出现一次的数字
 * Created by tanc on 17-6-14.
 */
public class FindNumberAppearOnceTest {

    @Test
    public void case1() throws Exception {
        int[] data = new int[]{12, 13, 14, 14, 15, 15, 16, 16, 12, 17};
        FindNumberAppearOnce.methodOne(data);
    }

    @Test
    public void case2() throws Exception {
        int[] data = new int[]{12, 13};
        FindNumberAppearOnce.methodOne(data);
    }
}