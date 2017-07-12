package org.offer.case55;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

/**
 * 面试题 55: 字符流中第一个不重复的字符
 * Created by tanc on 2017/7/12.
 */
public class CharFirstAppearTest {

    @Test
    public void case1() throws Exception {
        char result = CharFirstAppear.methodOne(new ByteArrayInputStream("google".getBytes()));
        assertEquals('l', result);
    }

}