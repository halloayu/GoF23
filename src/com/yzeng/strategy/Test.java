package com.yzeng.strategy;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // 整型排序
        int[] arr = {9,5,8,1,5,2,7};
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Cat排序
        Cat[] cats = {new Cat(1,2), new Cat(20,9), new Cat(11,8),new Cat(4,9)};
        CatSorter catSorter = new CatSorter();
        catSorter.sort(cats);
        System.out.println(Arrays.toString(cats));

        // Dog 排序
        Dog[] dogs = {new Dog(4), new Dog(8), new Dog(2), new Dog(99)};
        DogSorter<Dog> dogSorter = new DogSorter<>();
        dogSorter.sort(dogs, new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }

}
