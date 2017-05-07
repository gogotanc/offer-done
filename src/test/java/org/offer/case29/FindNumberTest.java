package org.offer.case29;

import org.junit.Assert;
import org.junit.Test;
import org.offer.utils.exception.IllegalOperationException;

/**
 * 面试题 29: 数组中出现次数超过一半的数字
 * Created by tanc on 17-5-7.
 */
public class FindNumberTest {

    @Test
    public void case1() throws Exception {
        int[] arr = new int[]{1, 2, 3, 2, 2, 2, 2, 5, 4, 2};
        int result;

        result = FindNumber.moreThanHalfNum(arr);
        Assert.assertEquals(2, result);
        result = FindNumber.moreThanHalfNumMethodTwo(arr);
        Assert.assertEquals(2, result);
        result = FindNumber.moreThanHalfNumMethodThree(arr);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case2() throws Exception {
        int[] arr = new int[]{2};
        int result;

        result = FindNumber.moreThanHalfNum(arr);
        Assert.assertEquals(2, result);
        result = FindNumber.moreThanHalfNumMethodTwo(arr);
        Assert.assertEquals(2, result);
        result = FindNumber.moreThanHalfNumMethodThree(arr);
        Assert.assertEquals(2, result);
    }

    @Test(expected = IllegalOperationException.class)
    public void case3() throws Exception {
        int[] arr = new int[]{};

        FindNumber.moreThanHalfNum(arr);
        FindNumber.moreThanHalfNumMethodTwo(arr);
        FindNumber.moreThanHalfNumMethodThree(arr);
    }

    @Test(expected = IllegalOperationException.class)
    public void case4() throws Exception {
        int[] arr = null;

        FindNumber.moreThanHalfNum(arr);
        // FindNumber.moreThanHalfNumMethodTwo(arr);
        // FindNumber.moreThanHalfNumMethodThree(arr);
    }

    @Test(expected = IllegalOperationException.class)
    public void case5() throws Exception {
        int[] arr = new int[]{1, 2, 3, 4};

        // FindNumber.moreThanHalfNum(arr);
        // FindNumber.moreThanHalfNumMethodTwo(arr);
        FindNumber.moreThanHalfNumMethodThree(arr);
    }
}