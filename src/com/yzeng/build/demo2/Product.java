package com.yzeng.build.demo2;

public class Product {

    private String Build1 = "汉堡堡"; // 默认的
    private String Build2 = "可乐";
    private String Build3 = "薯条";
    private String Build4 = "鸡腿";
    private String Build5 = "鸡翅";

    public String getBuild1() {
        return Build1;
    }

    public void setBuild1(String build1) {
        Build1 = build1;
    }

    public String getBuild2() {
        return Build2;
    }

    public void setBuild2(String build2) {
        Build2 = build2;
    }

    public String getBuild3() {
        return Build3;
    }

    public void setBuild3(String build3) {
        Build3 = build3;
    }

    public String getBuild4() {
        return Build4;
    }

    public void setBuild4(String build4) {
        Build4 = build4;
    }

    public String getBuild5() {
        return Build5;
    }

    public void setBuild5(String build5) {
        Build5 = build5;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Build1='" + Build1 + '\'' +
                ", Build2='" + Build2 + '\'' +
                ", Build3='" + Build3 + '\'' +
                ", Build4='" + Build4 + '\'' +
                ", Build5='" + Build5 + '\'' +
                '}';
    }
}
