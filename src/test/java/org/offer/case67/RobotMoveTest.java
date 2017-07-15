package org.offer.case67;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 67: 机器人的运动范围
 * Created by tanc on 2017/7/15.
 */
public class RobotMoveTest {

    @Test
    public void case1() throws Exception {
        assertEquals(21, RobotMove.methodOne(5, 10, 10));
    }

    @Test
    public void case2() throws Exception {
        assertEquals(359, RobotMove.methodOne(15, 20, 20));
    }

    @Test
    public void case3() throws Exception {
        assertEquals(29, RobotMove.methodOne(10, 1, 100));
    }

}