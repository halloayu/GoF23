package com.yzeng.strategy;

public class Sorter {

    // 选择排序
    public void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i<(len - 1); i++) {
            int pos = i;
            for (int j = i+1; j< len; j++) {
                pos = arr[j] < arr[pos] ? j : pos;
            }
            // 交换数值
            swap(arr, i , pos);
        }
    }

    private static void swap(int[] arr, int i, int pos) {
        if (i == pos) return;
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
}
