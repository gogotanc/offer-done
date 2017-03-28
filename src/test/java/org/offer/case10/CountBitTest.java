package org.offer.case10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 10：二进制中 1 的个数
 * Created by tanc on 2017/3/28.
 */
public class CountBitTest {

    @Test
    public void count() throws Exception {
//        int a = 8;
        int a = -9;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
    }

    @Test
    public void aaa() throws Exception {
        int a = -9;
        // int a = 9;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
    }

    @Test
    public void bbb() throws Exception {
//        int a = 8;
        int a = -9;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        a >>>= 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
    }

}