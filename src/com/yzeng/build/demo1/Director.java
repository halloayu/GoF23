package com.yzeng.build.demo1;

// 指挥者
public class Director {

    // 指挥工人按顺序建房子
    public Product build(Builder builder){
        builder.build1();
        builder.build2();
        builder.build3();
        builder.build4();
        builder.build5();
        return builder.getProduct();
    }
}
