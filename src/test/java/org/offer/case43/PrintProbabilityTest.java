package org.offer.case43;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 43：n 个骰子的点数
 * Created by tanc on 2017/7/5.
 */
public class PrintProbabilityTest {

    @Test
    public void case1() throws Exception {
        PrintProbability.methodOne(1);
    }

    @Test
    public void case2() throws Exception {
        PrintProbability.methodOne(3);
    }

    @Test
    public void case3() throws Exception {
        PrintProbability.methodTwo(1);
    }

}