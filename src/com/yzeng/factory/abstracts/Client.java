package com.yzeng.factory.abstracts;

import com.yzeng.factory.abstracts.factory.AppleFactory;
import com.yzeng.factory.abstracts.interfaces.IPhoneProduct;
import com.yzeng.factory.abstracts.interfaces.IRouterProduct;

public class Client {
    public static void main(String[] args) {
        System.out.println("Apple系列产品==>");
        AppleFactory appleFactory = new AppleFactory();
        IPhoneProduct iPhoneProduct = appleFactory.iPhoneProduct();
        iPhoneProduct.start();
        iPhoneProduct.callUp();
        iPhoneProduct.sendSMS();
        iPhoneProduct.shutdown();

        IRouterProduct iRouterProduct = appleFactory.iRouterProduct();
        iRouterProduct.start();
        iRouterProduct.openWifi();
        iRouterProduct.shutdown();

    }
}
