package org.offer.case24;

/**
 * 面试题 24：二叉搜索树的后序遍历序列
 * Created by tanc on 2017/4/10.
 */
public class VerifySequenceOfBST {

    public static boolean verify(int[] arr) {

        if (null == arr || arr.length == 0) {
            return false;
        }
        return verify(arr, 0, arr.length - 1);
    }

    private static boolean verify(int[] arr, int start, int end) {

        int len = end - start + 1;

        if (len <= 1) {
            return true;
        }

        int root = arr[end];

        int index = start;

        while (index < end) {
            if (arr[index] > root) {
                break;
            }
            index++;
        }

        for (int i = index; i < end; i++) {
            if (arr[i] < root) {
                return false;
            }
        }

        return verify(arr, start, index - 1) && verify(arr, index, end - 1);
    }
}
