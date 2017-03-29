package org.offer.case14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 14：调整数组顺序使奇数位于偶数前面
 * Created by tanc on 2017/3/29.
 */
public class ReorderOddEvenTest {

    @Test
    public void case1() throws Exception {
        int[] arr = {0, 2, 4, 6, 3, 7, 5, 9};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case2() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case3() throws Exception {
        int[] arr = {1};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case4() throws Exception {
        int[] arr = null;
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case5() throws Exception {
        int[] arr = {};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case6() throws Exception {
        int[] arr = {1, 3, 5, 7};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    @Test
    public void case7() throws Exception {
        int[] arr = {2, 4, 8, 0};
        ReorderOddEven.reorder(arr);
        printArr(arr);
    }

    private void printArr(int[] arr) {
        if (null == arr || arr.length == 0) {
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i : arr) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder.toString());
    }
}