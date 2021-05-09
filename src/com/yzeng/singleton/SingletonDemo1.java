package com.yzeng.singleton;

// 饿汉式单例
public class SingletonDemo1 {
    // 私有化构造器
    private SingletonDemo1() { }

    // 类初始化时，立即加载该对象
    private static final SingletonDemo1 instance = new SingletonDemo1();

    // 提供获取该对象的方法
    public static SingletonDemo1 getInstance() {
        return instance;
    }
}

class SingletonDemo1Test {
    public static void main(String[] args) {
        SingletonDemo1 instance1 = SingletonDemo1.getInstance();
        SingletonDemo1 instance2 = SingletonDemo1.getInstance();

        System.out.println(instance1 == instance2);
    }
}