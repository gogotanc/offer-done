package org.offer.case30;

import org.junit.Test;
import org.offer.utils.exception.IllegalOperationException;

/**
 * 面试题 30: 最小的 k 个数
 * Created by tanc on 17-5-7.
 */
public class GetLeastNumberTest {

    @Test
    public void case1() throws Exception {

        GetLeastNumber.methodOne(new int[]{1, 3, 4, 6, 5, 2, 7, 8, 9, 0}, 3);
    }

    @Test
    public void case2() throws Exception {

        GetLeastNumber.methodTwo(new int[]{1, 3, 4, 6, 5, 2, 7, 8, 9, 0}, 3);
    }

    @Test
    public void case3() throws Exception {

        GetLeastNumber.methodThree(new int[]{1, 3, 4, 6, 5, 2, 7, 8, 9, 0}, 3);
    }

    @Test
    public void case4() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodOne(data, 3);
        GetLeastNumber.methodOne(data, 10);
        GetLeastNumber.methodOne(data, 1);
    }

    @Test
    public void case5() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodTwo(data, 3);
        GetLeastNumber.methodTwo(data, 10);
        GetLeastNumber.methodTwo(data, 1);
    }

    @Test
    public void case6() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodThree(data, 3);
        GetLeastNumber.methodThree(data, 10);
        GetLeastNumber.methodThree(data, 1);
    }

    @Test(expected = IllegalOperationException.class)
    public void case7() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodOne(data, -3);
    }

    @Test(expected = IllegalOperationException.class)
    public void case8() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodTwo(data, -3);
    }

    @Test(expected = IllegalOperationException.class)
    public void case9() throws Exception {
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        GetLeastNumber.methodThree(data, -3);
    }
}