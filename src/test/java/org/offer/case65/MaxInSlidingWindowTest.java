package org.offer.case65;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 65: 滑动窗口的最大值
 * Created by tanc on 2017/7/14.
 */
public class MaxInSlidingWindowTest {

    @Test
    public void case1() throws Exception {
        int[] data = new int[]{2, 3, 4, 2, 6, 2, 5, 1};
        MaxInSlidingWindow.methodOne(data, 3);
    }

    @Test
    public void case2() throws Exception {
        int[] data = new int[]{2, 3, 4, 2, 6, 2, 5, 1};
        MaxInSlidingWindow.methodOne(data, 1);
    }

}