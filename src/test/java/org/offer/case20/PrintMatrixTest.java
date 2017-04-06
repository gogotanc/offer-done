package org.offer.case20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import static org.junit.Assert.*;

/**
 * 面试题 20：顺时针打印矩阵
 * Created by tanc on 2017/4/6.
 */
public class PrintMatrixTest {

    /* 将控制台输出写到 buffer 中，方便测试 */
    private ByteArrayOutputStream buffer;
    private PrintStream console;

    @Before
    public void redirect() {
                buffer = new ByteArrayOutputStream(128);
        console = System.out;
        System.setOut(new PrintStream(buffer));
    }

        @After
        public void done() {
            System.setOut(console);
        }

        @Test
        public void case1() throws Exception {
            Integer[][] arr = {
                    { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        PrintMatrix.printInCircle(arr);

        assertEquals("1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13,", buffer.toString());
    }

    @Test
    public void case2() throws Exception {
        Integer[][] arr = {{1}};

        PrintMatrix.printInCircle(arr);

        assertEquals("1,", buffer.toString());
    }

    @Test
    public void case3() throws Exception {
        Integer[][] arr = {{1, 2, 3}};

        PrintMatrix.printInCircle(arr);

        assertEquals("1,2,3,", buffer.toString());
    }

    @Test
    public void case4() throws Exception {
        Integer[][] arr = {
                { 1 },
                { 6 }
        };

        PrintMatrix.printInCircle(arr);

        assertEquals("1,6,", buffer.toString());
    }

    @Test
    public void case5() throws Exception {
        Integer[][] arr = {
                { 1, 2, 3 },
                { 6, 7, 8 },
        };

        PrintMatrix.printInCircle(arr);

        assertEquals("1,2,3,8,7,6,", buffer.toString());
    }

    @Test
    public void case6() throws Exception {
        Integer[][] arr = {
                { 1, 2 },
                { 6, 7 },
                {11,12 },
        };

        PrintMatrix.printInCircle(arr);

        assertEquals("1,2,7,12,11,6,", buffer.toString());
    }

}