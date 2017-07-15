package org.offer.case66;

/**
 * 面试题 66: 矩阵中的路径
 * Created by tanc on 2017/7/12.
 */
public class StringPathInMatrix {

    /**
     * 使用回溯法解决问题
     */
    public static boolean methodOne(char[][] matrix, String path) {

        if (null == matrix || matrix.length == 0 || matrix[0].length == 0 || null == path) {
            return false;
        }

        int y = matrix.length;
        int x = matrix[0].length;

        boolean[][] passed = new boolean[y][x];

        boolean result;

        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                result = hasPath(matrix, passed, i, j, path.toCharArray(), 0);
                if (result) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean hasPath(char[][] matrix, boolean[][] passed, int x, int y, char[] path, int index) {

        int maxX = matrix[0].length;
        int maxY = matrix.length;

        if (index == path.length) {
            return true;
        }

        boolean result = false;

        if (x >= 0 && x < maxX && y >= 0 && y < maxY && !passed[y][x] && matrix[y][x] == path[index]) {

            passed[y][x] = true;

            result =  hasPath(matrix, passed, x - 1, y, path, index + 1)
                   || hasPath(matrix, passed, x + 1, y, path, index + 1)
                   || hasPath(matrix, passed, x, y - 1, path, index + 1)
                   || hasPath(matrix, passed, x, y + 1, path, index + 1);

            if (!result) {
                passed[y][x] = false;
            }
        }

        return result;
    }
}
