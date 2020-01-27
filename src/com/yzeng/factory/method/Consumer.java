package com.yzeng.factory.method;

/**
 * 工厂方法模式，很繁琐
 * 但是新加一个产品不用改代码，只需要增加一个factory与car
 */

public class Consumer {
    public static void main(String[] args){
        Car car1 = new BenzFactory().getCar();
        Car car2 = new BMWFactory().getCar();
        car1.name();
        car2.name();
    }
}
