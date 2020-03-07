package com.yzeng.build.demo2;

public class User {
    public static void main(String[] args) {
        // 服务员
        Worker worker = new Worker();
        Product product = worker.getProduct();
        System.out.println(product.toString());
    }
}
