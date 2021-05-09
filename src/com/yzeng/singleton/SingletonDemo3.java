package com.yzeng.singleton;

// DCL懒汉式
public class SingletonDemo3 {
    // 私有化构造器
    private SingletonDemo3() {
    }

    // 类初始化时，不立即加载该对象
    // volatile关键字修饰的变量看到的随时是自己的最新值
    private volatile static SingletonDemo3 instance;

    // 提供获取该对象的方法，有sync锁，效率较低
    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null)
                    instance = new SingletonDemo3();
            }
        }
        return instance;
    }
}

class SingletonDemo3Test {
    public static void main(String[] args) {
        SingletonDemo3 instance1 = SingletonDemo3.getInstance();
        SingletonDemo3 instance2 = SingletonDemo3.getInstance();

        System.out.println(instance1 == instance2);
    }
}