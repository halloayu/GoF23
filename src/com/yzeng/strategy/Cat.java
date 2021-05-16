package com.yzeng.strategy;

public class Cat {
    int weight , height;
    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat cat) {
        int f1 = this.weight * this.height;
        int f2 = cat.weight * cat.height;
        if (f1 < f2) {
            return -1;
        } else if (f1 > f2) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
