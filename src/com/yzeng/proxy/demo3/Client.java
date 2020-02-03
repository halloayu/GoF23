package com.yzeng.proxy.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Landlord landlord = new Landlord();

        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 通过调用程序处理 角色 来处理我们要调用的 接口对象
        pih.setRent(landlord);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
