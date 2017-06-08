package org.offer.case33;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 33：把数组排成最小的数
 * Created by tanc on 17-6-8.
 */
public class PrintMinNumTest {

    @Test
    public void case1() throws Exception {
        int[] data = {3, 32, 321};
        long result = PrintMinNum.methodOne(data);
        System.out.println(result);
    }

    @Test
    public void case2() throws Exception {
        int[] data = {3, 32, 321};
        long result = PrintMinNum.methodTwo(data);
        System.out.println(result);
    }
}