package org.offer.case10;

/**
 * 面试题 10：二进制中 1 的个数
 * Created by tanc on 2017/3/28.
 */
public class CountBit {

    /**
     * 对输入进行右移，或者左移 flag，然后进行 与 操作实现。
     * 这里使用的是左移 flag 实现。
     */
    public static int methodOne(int n) {

        int count = 0;
        int flag = 1;

        while (flag != 0) {
            if ((n & flag) == flag) {
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    /**
     * 使用 (n - 1) & n 可以消去 n 里面最右边的 1 这一规律实现。
     */
    public static int methodTwo(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
