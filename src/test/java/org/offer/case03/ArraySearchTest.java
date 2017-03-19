package org.offer.case03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 3：二维数组的查找
 * Created by tanc on 2017/3/19.
 */
public class ArraySearchTest {

    @Test
    public void existCase() throws Exception {
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        assertEquals(true, ArraySearch.search(arr, 15));
        assertEquals(true, ArraySearch.search(arr, 1));
        assertEquals(true, ArraySearch.search(arr, 8));
    }

    @Test
    public void notExistCase() throws Exception {
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        assertEquals(false, ArraySearch.search(arr, 16));
        assertEquals(false, ArraySearch.search(arr, 0));
        assertEquals(false, ArraySearch.search(arr, 5));
    }

    @Test
    public void nullCase() throws Exception {
        int[][] emptyArr = {};
        int[][] nullArr = null;
        assertEquals(false, ArraySearch.search(emptyArr, 2));
        assertEquals(false, ArraySearch.search(nullArr, 2));
    }
}