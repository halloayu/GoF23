package com.yzeng.singleton;

import java.lang.reflect.Constructor;

// 改进
public class SingletonDemo5 {

    private static boolean flag = false; // 虽然这样可以阻止反射拿实例，但是依旧可以通过反射把flag改了，以此继续破坏

    private SingletonDemo5() {
        if (flag == false)
            flag = true;
        else
            throw new RuntimeException("不要试图用反射破坏我们的单例！");
    }

    private static class InnerClass {
        private static final SingletonDemo5 instance = new SingletonDemo5();
    }

    public static SingletonDemo5 getInstance() {
        return InnerClass.instance;
    }
}

class SingletonDemo5Test {
    public static void main(String[] args) throws Exception {
        SingletonDemo5 instance1 = SingletonDemo5.getInstance();
        SingletonDemo5 instance2 = SingletonDemo5.getInstance();
        // 反射破坏
        Constructor<SingletonDemo5> declaredConstructor = SingletonDemo5.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo5 instance3 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);
        System.out.println(instance1.hashCode());
        System.out.println(instance3.hashCode());
    }
}