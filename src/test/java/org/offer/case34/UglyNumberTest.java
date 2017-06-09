package org.offer.case34;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 34：丑数
 * Created by tanc on 17-6-9.
 */
public class UglyNumberTest {

    @Test
    public void print1500() throws Exception {
        long result = UglyNumber.printUglyNumber(1500);
        System.out.println(result);
    }

    @Test
    public void print() throws Exception {
        long result = UglyNumber.methodTwo(1500);
        System.out.println(result);
        // 859963392
    }

}