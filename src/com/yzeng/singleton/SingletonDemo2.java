package com.yzeng.singleton;

// 懒汉式
public class SingletonDemo2 {
    // 私有化构造器
    private SingletonDemo2() {
    }

    // 类初始化时，不立即加载该对象
    private static SingletonDemo2 instance;

    // 提供获取该对象的方法，有sync锁，效率较低
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null)
            instance = new SingletonDemo2();
        return instance;
    }

}
class SingletonDemo2Test {
    public static void main(String[] args) {
        SingletonDemo2 instance1 = SingletonDemo2.getInstance();
        SingletonDemo2 instance2 = SingletonDemo2.getInstance();

        System.out.println(instance1 == instance2);
    }
}