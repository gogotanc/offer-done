package org.offer.case02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 2：实现 Singleton 模式
 * Created by tanc on 2017/3/19.
 */
public class SingletonTest {

    @Test
    public void getInstance() throws Exception {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton011 = Singleton01.getInstance();

        Singleton02 singleton02 = Singleton02.getInstance();
        Singleton02 singleton021 = Singleton02.getInstance();

        Singleton03 singleton03 = Singleton03.getInstance();
        Singleton03 singleton031 = Singleton03.getInstance();

        Singleton04 singleton04 = Singleton04.getInstance();
        Singleton04 singleton041 = Singleton04.getInstance();

        Singleton05 singleton05 = Singleton05.getInstance();
        Singleton05 singleton051 = Singleton05.getInstance();

        Singleton06 singleton06 = Singleton06.INSTANCE;
        Singleton06 singleton061 = Singleton06.INSTANCE;

        assertEquals(true, singleton01.equals(singleton011));
        assertEquals(true, singleton02.equals(singleton021));
        assertEquals(true, singleton03.equals(singleton031));
        assertEquals(true, singleton04.equals(singleton041));
        assertEquals(true, singleton05.equals(singleton051));
        assertEquals(true, singleton06.equals(singleton061));

    }

}