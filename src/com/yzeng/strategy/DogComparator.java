package com.yzeng.strategy;

public class DogComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog t1, Dog t2) {
        if(t1.weight < t2.weight) return -1;
        else if(t1.weight > t2.weight) return 1;
        else return 0;
    }
}
