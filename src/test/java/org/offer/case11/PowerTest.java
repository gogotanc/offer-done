package org.offer.case11;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 面试题 11：数值的整数次方
 * Created by tanc on 2017/3/29.
 */
public class PowerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void case1() throws Exception {
        System.out.println(Power.methodOne(6.0, 3));
    }

    @Test
    public void case2() throws Exception {
        System.out.println(Power.methodOne(6.0, 0));
    }

    @Test
    public void case3() throws Exception {
        System.out.println(Power.methodOne(6.0, -3));
    }

    @Test
    public void case4() throws Exception {
        thrown.expect(RuntimeException.class);
        System.out.println(Power.methodOne(0.0, -3));
    }

    @Test
    public void case5() throws Exception {
        System.out.println(Power.methodOne(0.0, 0));
    }

    @Test
    public void case6() throws Exception {
        System.out.println(Power.methodOne(-2.0, 3));
    }

    @Test
    public void case7() throws Exception {
        System.out.println(Power.methodOne(-2.0, -3));
    }

    @Test
    @Ignore
    public void test() throws Exception {
        double result = 1.0 - 0.9;
        System.out.println(result);
        // 0.09999999999999998
        int res = 100 - 90;
        double d = (double) res / 100;
        System.out.println(d);
        // 0.1
    }
}