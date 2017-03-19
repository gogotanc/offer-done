package org.offer.case02;

/**
 * 单例模式：内部类实现
 * Created by tanc on 2017/3/19.
 */
public class Singleton05 {

    private Singleton05() {}

    public static Singleton05 getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static final Singleton05 instance = new Singleton05();
    }
}
