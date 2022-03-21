package com.yzeng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo2 {

    public static void main(String[] args) {
        User laoWang = new User("老王");

        // 旧版
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 新版
        // System.getProperties().put(“jdk.proxy.ProxyGenerator.saveGeneratedFiles”, “true”);

        BuyIphone buyIphone = (BuyIphone)Proxy.newProxyInstance(User.class.getClassLoader(),
                laoWang.getClass().getInterfaces(),
                new IPhoneHandler(laoWang));

        BuyMac buyMac = (BuyMac)Proxy.newProxyInstance(User.class.getClassLoader(),
                laoWang.getClass().getInterfaces(),
                new IPhoneHandler(laoWang));

        buyIphone.buyIphone();
        buyMac.buyMac();
    }

    public static class User implements BuyIphone, BuyMac {
        private String name;
        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void buyIphone() {
            System.out.println(this.name + "想买iphone");
        }

        @Override
        public void buyMac() {
            System.out.println(this.name + "想买Mac");
        }
    }

    public static class IPhoneHandler implements InvocationHandler {

        User user;

        public IPhoneHandler(User user) {
            this.user = user;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object o = null;
            if (method.getName().endsWith("buyIphone")) {
                o = method.invoke(user, args);
                System.out.println("苹果机代购商帮购买苹果机");
            } else if (method.getName().endsWith("buyMac")) {
                o = method.invoke(user, args);
                System.out.println("苹果机代购商帮购买Mac");
            }
            return o;
        }
    }

    public interface BuyIphone {
        public void buyIphone();
    }

    public interface BuyMac {
        public void buyMac();
    }

}
