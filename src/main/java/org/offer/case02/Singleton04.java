package org.offer.case02;

/**
 * 单例模式：双重校验锁
 *
 * 为什么在同步块内还要再检验一次？因为可能会有多个线程一起进入同步块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
 *
 * Created by tanc on 2017/3/19.
 */
public class Singleton04 {

    private static volatile Singleton04 instance;

    private Singleton04() {}

    public static Singleton04 getInstance() {
        if (null == instance) {
            synchronized (Singleton04.class) {
                if (null == instance) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
