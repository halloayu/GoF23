package com.yzeng.factory.abstracts;

import com.yzeng.factory.abstracts.interfaces.IPhoneProduct;

public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机拨打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发送短信");
    }
}
