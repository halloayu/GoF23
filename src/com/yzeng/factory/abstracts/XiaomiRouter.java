package com.yzeng.factory.abstracts;

import com.yzeng.factory.abstracts.interfaces.IRouterProduct;

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米路由器wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器");
    }
}
