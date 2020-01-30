package com.yzeng.factory.abstracts;

import com.yzeng.factory.abstracts.interfaces.IPhoneProduct;

public class ApplePhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启苹果手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭苹果手机");
    }

    @Override
    public void callUp() {
        System.out.println("苹果手机拨打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("苹果手机发送短信");
    }
}
