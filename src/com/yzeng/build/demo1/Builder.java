package com.yzeng.build.demo1;

// 虚拟建造者
public abstract class Builder {
    abstract void build1(); // 设计

    abstract void build2(); // 买材料

    abstract void build3(); // 铺设

    abstract void build4(); // 修饰

    abstract void build5(); // 完工

    abstract Product getProduct(); // 完工后得到产品
}
