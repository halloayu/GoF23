package com.yzeng.build.demo2;

public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder build1(String msg) {
        product.setBuild1(msg);
        return this;
    }

    @Override
    Builder build2(String msg) {
        product.setBuild2(msg);
        return this;
    }

    @Override
    Builder build3(String msg) {
        product.setBuild3(msg);
        return this;
    }

    @Override
    Builder build4(String msg) {
        product.setBuild4(msg);
        return this;
    }

    @Override
    Builder build5(String msg) {
        product.setBuild5(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
