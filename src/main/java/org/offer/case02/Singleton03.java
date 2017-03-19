package org.offer.case02;

/**
 * 单例模式：懒汉式（线程安全）
 * Created by tanc on 2017/3/19.
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {}

    public static synchronized Singleton03 getInstance() {
        if (null == instance) {
            instance = new Singleton03();
        }
        return instance;
    }
}
