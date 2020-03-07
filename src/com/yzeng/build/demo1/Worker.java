package com.yzeng.build.demo1;

// 具体建造者
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product(); // 工人负责创建产品
    }

    @Override
    void build1() {
        product.setBuild1("设计");
        System.out.println("设计");
    }

    @Override
    void build2() {
        product.setBuild2("买材料");
        System.out.println("买材料");
    }

    @Override
    void build3() {
        product.setBuild3("铺设");
        System.out.println("铺设");
    }

    @Override
    void build4() {
        product.setBuild4("修饰");
        System.out.println("修饰");
    }

    @Override
    void build5() {
        product.setBuild5("完工");
        System.out.println("完工");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
