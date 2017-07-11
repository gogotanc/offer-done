package org.offer.case48;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 48: 不能继承的类
 * Created by tanc on 2017/7/11.
 */
public class FinalClassTest {

    @Test
    public void case1() throws Exception {
        FinalClass f = new FinalClass(23);
        FinalClass2 f2 = FinalClass2.getInstance(23);
        f.show();
        f2.show();
    }
}