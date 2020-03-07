package com.yzeng.build.demo1;

public class Product {

    private String build1;
    private String build2;
    private String build3;
    private String build4;
    private String build5;

    public String getBuild1() {
        return build1;
    }

    public void setBuild1(String build1) {
        this.build1 = build1;
    }

    public String getBuild2() {
        return build2;
    }

    public void setBuild2(String build2) {
        this.build2 = build2;
    }

    public String getBuild3() {
        return build3;
    }

    public void setBuild3(String build3) {
        this.build3 = build3;
    }

    public String getBuild4() {
        return build4;
    }

    public void setBuild4(String build4) {
        this.build4 = build4;
    }

    public String getBuild5() {
        return build5;
    }

    public void setBuild5(String build5) {
        this.build5 = build5;
    }

    @Override
    public String toString() {
        return "Product{" +
                "build1='" + build1 + '\'' +
                ", build2='" + build2 + '\'' +
                ", build3='" + build3 + '\'' +
                ", build4='" + build4 + '\'' +
                ", build5='" + build5 + '\'' +
                '}';
    }
}
