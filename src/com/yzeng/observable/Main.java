package com.yzeng.observable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Goods goods = new Goods("白象方便面");
        goods.purchased();
    }
}

interface Observer  {
    void notifyUser(String goods);
}

class ZhangSan implements Observer {
    @Override
    public void notifyUser(String goods) {
        System.out.println("张三订阅的商品" + goods + "有货了");
    }
}

class LiSi implements Observer {
    @Override
    public void notifyUser(String goods) {
        System.out.println("李四订阅的商品" + goods + "有货了");
    }
}

class Goods {
    String name;
    public Goods(String name) {
        this.name = name;
    }

    private List<Observer> observers = new ArrayList<Observer>() {{
        add(new ZhangSan());
        add(new LiSi());
    }};

    public void purchased() {
        for (Observer o : observers) {
            o.notifyUser(name);
        }
    }

}
