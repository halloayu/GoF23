package com.yzeng.strategy;

public class DogSorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        int len = arr.length;
        for (int i = 0; i<(len - 1); i++) {
            int pos = i;
            for (int j = i+1; j< len; j++) {
                pos = comparator.compare(arr[j], arr[pos]) == -1 ? j : pos;
            }
            // 交换数值
            swap(arr, i , pos);
        }
    }

    void swap(T[] arr, int i, int pos) {
        if (i == pos) return;
        T temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
}
