package com.yzeng.factory.simple;

public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("宝马汽车")) {
            return new BMW();
        } else if (car.equals("奔驰汽车")) {
            return new Benz();
        } else {
            return null;
        }
    }
}
