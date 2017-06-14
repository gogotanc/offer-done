package org.offer.case36;

/**
 * 面试题 36： 数组中的逆序对
 * Created by tanc on 17-6-14.
 */
public class InversePairs {

    /**
     * 方法一：依次遍历一遍
     */
    public static int methodOne(int[] array) {
        if (!checkData(array)) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * 方法二：寻找规律，类似归并排序
     */
    public static int methodTwo(int[] array) {
        if (!checkData(array)) {
            return 0;
        }
        int[] tempArr = new int[array.length];
        return sort(array, tempArr, 0, array.length - 1);
    }

    /**
     * 归并排序
     * @return 返回排序中出现逆序对的数量
     */
    private static int sort(int[] src, int[] des, int start, int end) {
        if (start == end) {
            des[start] = src[start];
            return 0;
        }

        int middle = (start + end) / 2;
        int start2 = middle + 1;

        int a = sort(src, des, start, middle);
        int b = sort(src, des, start2, end);
        int c = merge(src, des, start, end);
        return a + b + c;
    }

    /**
     * 合并操作
     */
    private static int merge(int[] src, int[] des, int start, int end) {
        int middle = (start + end) / 2;
        int s1 = start;
        int e1 = middle;
        int s2 = middle + 1;
        int e2 = end;
        int index = start;
        int count = 0;

        while (s1 <= e1 && s2 <= e2) {
            if (src[s1] > src[s2]) {
                des[index++] = src[s2++];
                // merge 操作中，这里表示有逆序对
                count += e1 - s1 + 1;
            } else {
                des[index++] = src[s1++];
            }
        }

        while (s1 <= e1) {
            des[index++] = src[s1++];
        }
        while (s2 <= e2) {
            des[index++] = src[s2++];
        }

        // 将 merge 结果复制到 src 数组中
        System.arraycopy(des, start, src, start, end + 1 - start);

        return count;
    }

    /**
     * 检查输入是否合法
     */
    private static boolean checkData(int[] data) {
        return !(null == data || data.length <= 1);
    }
}
