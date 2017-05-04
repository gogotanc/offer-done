package org.offer.case28;

import org.junit.Test;

/**
 * 面试题 28: 字符串的排列
 * Created by tanc on 17-5-4.
 */
public class PermutationTest {

    @Test
    public void case1() throws Exception {

        Permutation.permutation("abc");
    }

    @Test
    public void case2() throws Exception {

        Permutation.permutation("a");
    }

    @Test
    public void case3() throws Exception {

        Permutation.permutation("");
    }

    @Test
    public void case4() throws Exception {

        Permutation.permutation(null);
    }

    @Test
    public void case5() throws Exception {

        // 这个题目好像没说明有重复字符的问题
        Permutation.permutation("aabc");
    }
}