package com.yzeng.proxy.demo1;


// landlord
public class Landlord implements Rent {

    @Override
    public void rent() {
        System.out.println("The landlord wants to rent the house!");
    }
}
