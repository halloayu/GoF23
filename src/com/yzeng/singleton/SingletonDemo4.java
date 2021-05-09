package com.yzeng.singleton;

import java.lang.reflect.Constructor;

// 饿汉式改进
// 静态内部类实现
public class SingletonDemo4 {
    private SingletonDemo4() {
    }

    private static class InnerClass{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance(){
        return InnerClass.instance;
    }
}

// 反射机制：可以破坏上面的单例模式

class SingletonDemo4Test {
    public static void main(String[] args) throws Exception {
        SingletonDemo4 instance1 = SingletonDemo4.getInstance();
        SingletonDemo4 instance2 = SingletonDemo4.getInstance();
        // 反射破坏
        Constructor<SingletonDemo4> declaredConstructor = SingletonDemo4.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo4 instance3 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);
        System.out.println(instance1.hashCode());
        System.out.println(instance3.hashCode());
    }
}