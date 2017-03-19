package org.offer.case04;

/**
 * 面试题 4：替换空格
 * Created by tanc on 2017/3/19.
 */
public class ReplaceSpace {

    public static String replace(String src) {

        if (null == src) {
            return null;
        }

        int count = 0;
        byte[] buffer = src.getBytes();
        for (byte b : buffer) {
            if (b == ' ') {
                count++;
            }
        }

        if (count == 0) {
            return src;
        }

        byte[] result = new byte[buffer.length + count * 2];
        int p = result.length - 1;

        for (int i = buffer.length - 1; i >= 0; i--) {
            if (buffer[i] == ' ') {
                result[p--] = '0';
                result[p--] = '2';
                result[p--] = '%';
            } else {
                result[p--] = buffer[i];
            }
        }
        return new String(result);
    }
}
