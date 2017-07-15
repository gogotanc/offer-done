package org.offer.case66;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 66: 矩阵中的路径
 * Created by tanc on 2017/7/15.
 */
public class StringPathInMatrixTest {

    @Test
    public void case1() throws Exception {
        char[][] matrix = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String path = "ABCCED";

        boolean result = StringPathInMatrix.methodOne(matrix, path);
        assertEquals(true, result);
    }

    @Test
    public void case2() throws Exception {
        char[][] matrix = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String path = "SEE";

        boolean result = StringPathInMatrix.methodOne(matrix, path);
        assertEquals(true, result);
    }

    @Test
    public void case3() throws Exception {
        char[][] matrix = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String path = "ABCB";

        boolean result = StringPathInMatrix.methodOne(matrix, path);
        assertEquals(false, result);
    }

    @Test
    public void case4() throws Exception {
        char[][] matrix = new char[][]{
                {'A'}
        };
        String path = "A";

        boolean result = StringPathInMatrix.methodOne(matrix, path);
        assertEquals(true, result);
    }

    @Test
    public void case5() throws Exception {
        char[][] matrix = new char[][]{
                {'A', 'B', 'C', 'E', 'H', 'J', 'I', 'G'},
                {'S', 'F', 'C', 'S', 'L', 'O', 'P', 'Q'},
                {'A', 'D', 'E', 'E', 'M', 'N', 'O', 'E'},
                {'A', 'D', 'I', 'D', 'E', 'J', 'F', 'M'},
                {'V', 'C', 'E', 'I', 'F', 'G', 'G', 'S'}
        };
        String path = "SGGFIECVAASABCEHJIGQEMS";

        boolean result = StringPathInMatrix.methodOne(matrix, path);
        assertEquals(false, result);
    }

}