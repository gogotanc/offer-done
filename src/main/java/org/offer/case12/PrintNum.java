package org.offer.case12;

/**
 * 面试题 12：打印 1 到最大的 n 位数
 * Created by tanc on 2017/3/29.
 */
public class PrintNum {

    /**
     * 方法一；直接累加，打印输出
     * 不能处理大数情况
     */
    public static void printToMaxOfNDigits(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            num *= 10;
        }
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
    }

    /**
     * 方法二：使用字符数组模拟操作
     */
    public static void printToMaxOfNDigitsStr(int n) {
        if (n <= 0) {
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = '0';
        }
        boolean flag = true;
        while(flag) {
            flag = add(num);
            if (flag) {
                printCharArrToNum(num);
            }
        }
    }

    /**
     * 方法三：递归全排列实现
     */
    public static void printToMaxOfNDigitsThree(int n) {
        if (n <= 0) {
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = '0';
        }
        for (int i = 0; i < 10; i++) {
            num[0] = (char)('0' + i);
            print(num, 1);
        }
    }

    /**
     * 递归全排列
     */
    private static void print(char[] num, int index) {
        if (index > num.length - 1) {
            printCharArrToNum(num);
            return;
        }
        for (int i = 0; i < 10; i++ ) {
            num[index] = (char)('0' + i);
            print(num, index + 1);
        }
    }

    /**
     * 字符数组加一操作
     */
    private static boolean add(char[] num) {

        boolean flag = true;
        int index = num.length - 1;

        while (flag) {
            num[index]++;
            if (num[index] > '9') {
                if (index > 0) {
                    num[index] = '0';
                    index--;
                } else {
                    return false;
                }
            } else {
                flag = false;
            }
        }

        return true;
    }

    /**
     * 打印字符数组
     */
    private static void printCharArrToNum(char[] num) {
        boolean findNot0 = false;
        for (char c : num) {
            if (c != '0') {
                findNot0 = true;
                System.out.print(c);
            } else if (findNot0) {
                System.out.print(c);
            }
        }
        // 不全为 0 才打印
        if (findNot0) {
            System.out.println();
        }
    }
}
