package com.yzeng.build.demo1;

public class User {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
