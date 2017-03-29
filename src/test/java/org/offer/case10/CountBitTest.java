package org.offer.case10;

import org.junit.Test;

/**
 * 面试题 10：二进制中 1 的个数
 * Created by tanc on 2017/3/28.
 */
public class CountBitTest {

    @Test
    public void case1() throws Exception {
        System.out.println(Integer.toBinaryString(1) + " 中 1 的个数为：" + CountBit.methodOne(1) + " 个。");
        System.out.println(Integer.toBinaryString(1) + " 中 1 的个数为：" + CountBit.methodTwo(1) + " 个。");
    }

    @Test
    public void case2() throws Exception {
        System.out.println(Integer.toBinaryString(0x7fffffff) + " 中 1 的个数为：" + CountBit.methodOne(0x7fffffff) + " 个。");
        System.out.println(Integer.toBinaryString(0x7fffffff) + " 中 1 的个数为：" + CountBit.methodTwo(0x7fffffff) + " 个。");
    }

    @Test
    public void case3() throws Exception {
        System.out.println(Integer.toBinaryString(0x80000000) + " 中 1 的个数为：" + CountBit.methodOne(0x80000000) + " 个。");
        System.out.println(Integer.toBinaryString(0x80000000) + " 中 1 的个数为：" + CountBit.methodTwo(0x80000000) + " 个。");
    }

    @Test
    public void case4() throws Exception {
        System.out.println(Integer.toBinaryString(0xffffffff) + " 中 1 的个数为：" + CountBit.methodOne(0xffffffff) + " 个。");
        System.out.println(Integer.toBinaryString(0xffffffff) + " 中 1 的个数为：" + CountBit.methodTwo(0xffffffff) + " 个。");
    }

    @Test
    public void case5() throws Exception {
        System.out.println(Integer.toBinaryString(0) + " 中 1 的个数为：" + CountBit.methodOne(0) + " 个。");
        System.out.println(Integer.toBinaryString(0) + " 中 1 的个数为：" + CountBit.methodTwo(0) + " 个。");
    }
}