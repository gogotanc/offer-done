package org.offer.case04;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 4：替换空格
 * Created by tanc on 2017/3/19.
 */
public class ReplaceSpaceTest {

    @Test
    public void replace() throws Exception {

        String case1 = "hello world.";
        String case2 = " hello";
        String case3 = null;
        String case4 = "";
        String case5 = "     ";

        assertEquals(true, "hello%20world.".equals(ReplaceSpace.replace(case1)));
        assertEquals(true, "%20hello".equals(ReplaceSpace.replace(case2)));
        assertEquals(null, ReplaceSpace.replace(case3));
        assertEquals(true, "".equals(ReplaceSpace.replace(case4)));
        assertEquals(true, "%20%20%20%20%20".equals(ReplaceSpace.replace(case5)));
    }
}