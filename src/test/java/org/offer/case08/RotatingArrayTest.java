package org.offer.case08;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 8：旋转数组的最小数字
 * Created by tanc on 2017/3/28.
 */
public class RotatingArrayTest {

    @Test
    public void case1() throws Exception {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(RotatingArray.min(arr));
    }

    @Test
    public void case2() throws Exception {
        int[] arr = {1, 1, 1, 1, 1, 1, 0, 1, 1};
        System.out.println(RotatingArray.min(arr));
    }

    @Test
    public void case3() throws Exception {
        int[] arr = {1, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(RotatingArray.min(arr));
    }

    @Test
    public void case4() throws Exception {
        int[] arr = {};
        System.out.println(RotatingArray.min(arr));
    }

    @Test
    public void case5() throws Exception {
        int[] arr = {0};
        System.out.println(RotatingArray.min(arr));
    }

}