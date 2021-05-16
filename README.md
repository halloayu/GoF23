# GoF23

java的23种设计模式理解<br>

# 1 单例模式

### 饿汉式单例
```java
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
```
缺点：不管有没有用到，类装载完成就实例化

### 饿汉式改进
```java
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
```
用静态内部类解决实例化问题，不过这种方式可以被反射破坏掉，但是已经很完美了。

### 懒汉式
```java
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
```
缺点：会存在多线程不安全问题

### 双检索模式
```java
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
```

### 枚举模式
```java
public enum SingletonDemo6 {
    INSTANCE;
    public SingletonDemo6 getInstance() {
        return INSTANCE;
    }
}
```
这种模式很完美！

# 2 策略模式
策略模式属于对象的行为模式。
其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
策略模式使得算法可以在不影响到客户端的情况下发生变化。

