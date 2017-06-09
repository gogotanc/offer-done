package org.offer.case35;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 35：第一个只出现一次的字符
 * Created by tanc on 17-6-9.
 */
public class FirstNotRepeatingCharTest {

    @Test
    public void methodOne() throws Exception {
        char result = FirstNotRepeatingChar.methodOne("bcdeadcb");
        assertEquals('e', result);
    }

    @Test
    public void methodTwo() throws Exception {
        char result = FirstNotRepeatingChar.methodTwo("abcdedcb");
        assertEquals('a', result);
    }

}