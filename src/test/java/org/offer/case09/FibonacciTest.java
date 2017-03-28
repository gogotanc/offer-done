package org.offer.case09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 9：斐波那契数列
 * Created by tanc on 2017/3/28.
 */
public class FibonacciTest {

    @Test
    public void methodOne() throws Exception {
        long start = System.nanoTime();
        System.out.println(Fibonacci.methodOne(100L));
        long end = System.nanoTime();
        long time = (end - start) / 1000000;
        System.out.println("running time is " + time + " s");
        // too long
    }

    @Test
    public void methodTwo() throws Exception {
        long start = System.nanoTime();
        System.out.println(Fibonacci.methodTwo(100L));
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("running time is " + time + " ns");
        // running time is 571969 ns
    }
}