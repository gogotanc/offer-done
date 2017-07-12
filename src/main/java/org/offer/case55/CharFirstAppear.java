package org.offer.case55;

import org.offer.utils.exception.IllegalOperationException;

import java.io.IOException;
import java.io.InputStream;

/**
 * 面试题 55: 字符流中第一个不重复的字符
 * Created by tanc on 2017/7/12.
 */
public class CharFirstAppear {

    /**
     * 使用 hash
     * 下标为字符的 ascii code
     * 数组中的值有三种：
     * -1 表示没有出现
     * -2 表示多次出现
     * >0 表示在字符流中的次序
     *
     * 最终结果就是找 hash 数组中值大于 0 且最小的那个值的下标。
     */
    public static char methodOne(InputStream inputStream) throws IOException {
        int[] hash = new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        int order = 1;
        int readCode;
        while ((readCode = inputStream.read()) != -1) {
            int value = hash[readCode];
            if (value == -1) {
                hash[readCode] = order;
            } else if (value > 0) {
                hash[readCode] = -2;
            }
            order++;
        }

        int resultOrder = -1;
        int result = 0;
        for (int i = 0; i < hash.length; i++) {
            int data = hash[i];
            if (data > 0) {
                if (resultOrder == -1 || resultOrder > data) {
                    resultOrder = data;
                    result = i;
                }
            }
        }
        if (resultOrder == -1) {
            throw new IllegalOperationException("没有符合条件的字符");
        }

        return (char) result;
    }
}
