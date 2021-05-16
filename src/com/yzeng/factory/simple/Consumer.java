package com.yzeng.factory.simple;

/**
 * 静态工厂模式，最常用
 * 但是新加一个产品就得去改CarFactory
 */

public class Consumer {
    public static void main(String[] args) {
        // 传统方式买车
//        Car car1 = new BMW();
//        Car car2 = new Benz();
//        car1.name();
//        car2.name();
        Car car1 = CarFactory.getCar("宝马汽车");
        Car car2 = CarFactory.getCar("奔驰汽车");
        car1.name();
        car2.name();

    }
}
