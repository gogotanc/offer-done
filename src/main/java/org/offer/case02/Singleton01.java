package org.offer.case02;

/**
 * 单例模式：恶汉式
 * Created by tanc on 2017/3/19.
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
