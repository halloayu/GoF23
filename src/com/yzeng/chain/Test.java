package com.yzeng.chain;

public class Test {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("奔走相告！掘金创作者中心上线啦！更多超多礼品等你来拿，快来体验一下吧！");

        FilterChain fc = new FilterChain();
        fc.add(new OneFilter())
                .add(new TwoFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new ThreeFilter()).add(new FourFilter());
        fc.add(fc2);
        fc.doFilter(msg);
        System.out.println(msg);
    }
}

class Msg {
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}