package org.offer.case35;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 面试题 35：第一个只出现一次的字符
 * Created by tanc on 17-6-9.
 */
public class FirstNotRepeatingChar {

    /**
     * 方法一：使用了 java 中的 linkedHashMap
     * 这个方法不好在于遍历的是 map，所以需要 map 保持插入时的顺序
     */
    public static char methodOne(String data) {
        char[] chars = data.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                int value = map.get(c);
                map.put(c, value + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            if (num == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("没有正确结果");
    }

    /**
     * 方法二：创建一个简单的 hash table，遍历两次输入的字符串就可以得到结果
     */
    public static char methodTwo(String data) {
        int[] hashTable = new int[256];
        for (int i = 0; i < 256; i++) {
            hashTable[i] = 0;
        }
        char[] chars = data.toCharArray();
        for (char c : chars) {
            hashTable[c]++;
        }
        for (char c : chars) {
            if (hashTable[c] == 1) {
                return c;
            }
        }
        throw new RuntimeException("没有正确的结果");
    }
}
