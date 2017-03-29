package org.offer.case12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 12：打印 1 到最大的 n 位数
 * Created by tanc on 2017/3/29.
 */
public class PrintNumTest {

    private long start;

    @Before
    public void before() {
        start = System.nanoTime();
    }

    @After
    public void end() {
        System.out.println(System.nanoTime() - start + " ns");
    }

    @Test
    public void methodOne() throws Exception {
        PrintNum.printToMaxOfNDigits(4);
        // 89531972 ns
    }

    @Test
    public void methodTwo() throws Exception {
        PrintNum.printToMaxOfNDigitsStr(4);
        // 136977099 ns
    }

    @Test
    public void methodThree() throws Exception {
        PrintNum.printToMaxOfNDigitsThree(4);
        // 142921969 ns
    }

}