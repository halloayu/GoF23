package com.yzeng.proxy;

public class ProxyDemo1 {

    public static void main(String[] args) {
        User laoWang = new User("老王");

        IPhoneProxy iPhoneProxy = new IPhoneProxy(new MacProxy(laoWang));
        iPhoneProxy.buy();
    }

    public static class User implements Buy {
        private String name;
        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        @Override
        public void buy() {
            System.out.println(this.name + "想买东西");
        }
    }

    public static class IPhoneProxy implements Buy {

        Buy buy;

        public IPhoneProxy(Buy buy) {
            this.buy = buy;
        }

        @Override
        public void buy() {
            buy.buy();
            System.out.println("苹果机代购商帮购买苹果机");
        }
    }

    public static class MacProxy implements Buy {

        Buy buy;

        public MacProxy(Buy buy) {
            this.buy = buy;
        }

        @Override
        public void buy() {
            buy.buy();
            System.out.println("Mac代购商帮购买Mac");
        }
    }

    public interface Buy {
        public void buy();
    }

}
