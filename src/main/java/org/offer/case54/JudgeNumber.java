package org.offer.case54;

/**
 * 面试题 54: 表示数值的字符串
 * Created by tanc on 2017/7/12.
 */
public class JudgeNumber {

    public static boolean methodOne(String string) {

        if (null == string || string.length() == 0) {
            return false;
        }

        Chars chars = new Chars(string.toCharArray());

        boolean result = scanInteger(chars);

        if (chars.checkIndex() && chars.next() == '.') {
            chars.index++;
            result = scanUnsignedInteger(chars) || result;
        }

        if (chars.checkIndex() && (chars.next() == 'e' || chars.next() == 'E')) {
            chars.index++;
            result = scanInteger(chars) && result;
        }

        // 还要判断是否遍历完了输入的字符串 !chars.checkIndex();
        return result && !chars.checkIndex();
    }

    private static boolean scanUnsignedInteger(Chars chars) {
        int tempIndex = chars.index;
        while (chars.checkIndex() && chars.next() >= '0' && chars.next() <= '9') {
            chars.index++;
        }
        return chars.index > tempIndex;
    }

    private static boolean scanInteger(Chars chars) {
        if (chars.next() == '-' || chars.next() == '+') {
            chars.index++;
        }
        return scanUnsignedInteger(chars);
    }

    /**
     * 封装一下输入的字符串
     * 添加一个 index 变量，表示下一个待检测位置
     */
    private static class Chars {

        char[] data;
        int index;

        Chars(char[] data) {
            this(data, 0);
        }

        Chars(char[] data, int index) {
            this.data = data;
            this.index = index;
        }

        /**
         * 获取下一个待读取的元素，下标不前移
         */
        public char next() {
            return data[index];
        }

        /**
         * 检查 index 是否在有效范围内
         */
        public boolean checkIndex() {
            return index < data.length && index >= 0;
        }

    }

}
