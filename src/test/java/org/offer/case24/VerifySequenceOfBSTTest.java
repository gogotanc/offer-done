package org.offer.case24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 24：二叉搜索树的后序遍历序列
 * Created by tanc on 2017/4/10.
 */
public class VerifySequenceOfBSTTest {

    @Test
    public void case1() throws Exception {
        int[] arr = {5, 7, 6, 9, 11, 10, 8};
        assertEquals(true, VerifySequenceOfBST.verify(arr));
    }

    @Test
    public void case2() throws Exception {
        int[] arr = {7, 4, 6, 5};
        assertEquals(false, VerifySequenceOfBST.verify(arr));
    }

    @Test
    public void case3() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(true, VerifySequenceOfBST.verify(arr));
    }

    @Test
    public void case4() throws Exception {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        assertEquals(true, VerifySequenceOfBST.verify(arr));
    }

    @Test
    public void case5() throws Exception {
        int[] arr = {7};
        assertEquals(true, VerifySequenceOfBST.verify(arr));
    }

}