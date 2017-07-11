package org.offer.case48;

/**
 * 面试题 48: 不能继承的类
 * Created by tanc on 2017/7/11.
 */
public final class FinalClass {

    // Java 中直接使用 final 关键字修饰类，即可使类变成不可继承类。

    private int id;

    public FinalClass(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println(id);
    }

}

class FinalClass2 {

    // 私有话构造函数也是可以的，但是也没有办法像正常类一样 new。

    private int id;

    private FinalClass2(int id) {
        this.id = id;
    }

    // 创建实例的方法
    public static FinalClass2 getInstance(int num) {
        return new FinalClass2(num);
    }

    public void show() {
        System.out.println(id);
    }

}
