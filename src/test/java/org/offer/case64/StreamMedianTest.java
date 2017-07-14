package org.offer.case64;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 面试题 64: 数据流中的中位数
 * Created by tanc on 2017/7/14.
 */
public class StreamMedianTest {

    @Test
    public void case1() throws Exception {
        List<Integer> data = new ArrayList<>();
        data.add(9);
        data.add(6);
        data.add(5);
        data.add(4);
        data.add(2);
        data.add(8);
        data.add(1);
        data.add(7);
        data.add(3);
        int result = StreamMedian.methodOne(data);
        assertEquals(5, result);
    }

    @Test
    public void case2() throws Exception {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(9);
        data.add(6);
        data.add(5);
        data.add(4);
        data.add(2);
        data.add(8);
        data.add(10);
        data.add(7);
        data.add(3);
        int result = StreamMedian.methodOne(data);
        assertEquals(5, result);
    }
}