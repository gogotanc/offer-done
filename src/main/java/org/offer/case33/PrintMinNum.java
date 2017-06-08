package org.offer.case33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题 33：把数组排成最小的数
 * Created by tanc on 17-6-8.
 */
public class PrintMinNum {

    /**
     * 方法一：全排列
     */
    public static long methodOne(int[] data) {

        if (null == data || data.length == 0) {
            return 0L;
        }

        checkData(data);

        String[] nums = convert(data);

        List<String> result = new ArrayList<>();

        permutation(nums, 0, result);

        result.sort(String::compareTo);

        return Long.valueOf(result.get(0));
    }

    /**
     * 方法二：书中的方法
     * 对数组中的数 n m 进行排序，排序规则为 mn < nm 则，m 位于 n 前面。
     * 通过这样排序，最终的顺序就是拼接的最小数。
     */
    public static long methodTwo(int[] data) {
        if (null == data || data.length == 0) {
            return 0L;
        }
        checkData(data);

        String[] nums = convert(data);

        // 这里时关键 定义一个比较规则
        Arrays.sort(nums, (m, n) -> {
            String mn = m + n;
            String nm = n + m;
            return mn.compareTo(nm);
        });

        return Long.valueOf(toString(nums));
    }

    /**
     * 检查输入
     */
    private static void checkData(int[] data) {
        for (int i : data) {
            if (i < 0) {
                throw new RuntimeException("输入非法");
            }
        }
    }

    /**
     * 全排列一个 string 数组
     */
    private static void permutation(String[] nums, int index, List<String> results) {

        if (index == nums.length) {
            results.add(toString(nums));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            String temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;

            permutation(nums, index + 1, results);

            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    /**
     * int 数组转 string 数组
     */
    private static String[] convert(int[] data) {
        String[] numberStrs = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            numberStrs[i] = String.valueOf(data[i]);
        }
        return numberStrs;
    }

    /**
     * 将一个 string 数组拼接成一个 string
     */
    private static String toString(String[] data) {
        StringBuilder builder = new StringBuilder();
        for (String s : data) {
            builder.append(s);
        }
        return builder.toString();
    }
}
