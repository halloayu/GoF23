package com.yzeng.proxy.demo1;

public class Proxy implements Rent {

    private Landlord landlord;

    public Proxy() {

    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        System.out.println("The agent helps the landlord rent the house!");
        landlord.rent();
    }

    // Show the client the house
    public void showHouses() {
        System.out.println("Show the client the house!");
    }

    // Sign the contract
    public void signContract(){
        System.out.println("Sign the contract!");
    }

    // remuneration
    public void getRemuneration(){
        System.out.println("The agent collects remuneration from the client!");
    }
}
