package com.yzeng.singleton;


// 枚举模式，天然防反射
public enum SingletonDemo6 {
    INSTANCE;

    public SingletonDemo6 getInstance() {
        return INSTANCE;
    }
}
