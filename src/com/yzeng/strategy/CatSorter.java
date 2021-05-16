package com.yzeng.strategy;

public class CatSorter {

    public void sort(Cat[] arr) {
        int len = arr.length;
        for (int i = 0; i<(len - 1); i++) {
            int pos = i;
            for (int j = i+1; j< len; j++) {
                pos = arr[j].compareTo(arr[pos]) == -1 ? j : pos;
            }
            // 交换数值
            swap(arr, i , pos);
        }
    }

    private static void swap(Cat[] arr, int i, int pos) {
        if (i == pos) return;
        Cat temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
}
