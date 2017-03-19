package org.offer.case02;

/**
 * 单例模式：懒汉式
 * Created by tanc on 2017/3/19.
 */
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        if (null == instance) {
            instance = new Singleton02();
        }
        return instance;
    }
}
