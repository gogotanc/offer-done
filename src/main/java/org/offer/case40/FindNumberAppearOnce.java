package org.offer.case40;

/**
 * 面试题 40: 数组中只出现一次的数字
 * Created by tanc on 17-6-14.
 */
public class FindNumberAppearOnce {

    /**
     * 使用异或的性质来完成这个题目
     * 1. 从头到尾异或每一个数字，得到的结果是那两个只出现一次数字的异或结果
     * 2. 在结果中找到 1 在第 N 位，再判断所有数字的第 N 位是否为 1
     * 3. 将数组分成两个数组，每个数组中包含一个只出现一次的数字
     * 4. 这样再对两个数组做步骤 1，得到的结果就是原数组中只出现一次的两个数字
     */
    public static void methodOne(int[] data) {
        if (null == data || data.length == 0) {
            return;
        }

        int result = xor(data);
        int index = index(result);
        int a = 0;
        int b = 0;

        for (int num : data) {
            if (isN(num, index)) {
                a = a ^ num;
            } else {
                b = b ^ num;
            }
        }

        System.out.println(a + " .. " + b);
    }

    /**
     * 对一个数组进行异或操作
     */
    private static int xor(int[] data) {
        int result = 0;
        for (int num : data) {
            result = result ^ num;
        }
        return result;
    }

    /**
     * 返回一个数字出现 1 的位置
     */
    private static int index(int num) {
        int index = 1;
        while (num != 0) {
            if ((num & 1) == 1) {
                return index;
            }
            num = num >> 1;
            index++;
        }
        return 0;
    }

    /**
     * 判断数字某位是否为 1
     */
    private static boolean isN(int num, int index) {
        for (int i = 1; i < index; i++) {
            num >>= 1;
        }
        return (num & 1) == 1;
    }

}
