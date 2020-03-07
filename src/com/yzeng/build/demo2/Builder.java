package com.yzeng.build.demo2;

public abstract class Builder {
    abstract Builder build1(String msg); // 可以传入值，默认汉堡堡

    abstract Builder build2(String msg); // 可乐

    abstract Builder build3(String msg); // 薯条

    abstract Builder build4(String msg); // 鸡腿

    abstract Builder build5(String msg); // 鸡翅

    abstract Product getProduct(); // 完工后得到产品
}
