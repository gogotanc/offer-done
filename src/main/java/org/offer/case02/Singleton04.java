package org.offer.case02;

/**
 * 单例模式：双重校验锁
 * Created by tanc on 2017/3/19.
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {

    }

    public static Singleton04 getInstance() {
        if (null == instance) {
            synchronized (Singleton04.class) {
                instance = new Singleton04();
            }
        }
        return instance;
    }
}
