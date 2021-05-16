package com.yzeng.strategy;

public class Dog implements Comparable<Dog> {
    int weight;

    public Dog(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.weight < dog.weight) return -1;
        else if(this.weight > dog.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
