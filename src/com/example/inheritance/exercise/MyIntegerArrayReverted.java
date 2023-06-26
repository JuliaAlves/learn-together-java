package com.example.inheritance.exercise;

import java.util.Arrays;

public class MyIntegerArrayReverted extends MyIntegerArray{
    public MyIntegerArrayReverted(int[] ints) {
        super(ints);
    }

    public int[] sorted() {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int maxVal = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = maxVal;
        }
        return array;
    }

    public static void main(String[] args) {
        MyIntegerArrayReverted array2 = new MyIntegerArrayReverted(new int[]{5, 2, 4, 1, 3});
        System.out.println(Arrays.toString(array2.sorted()));
        MyIntegerArrayAscending array1 = new MyIntegerArrayAscending(new int[]{5, 2, 4, 1, 3});
        System.out.println(Arrays.toString(array1.sorted()));
    }
}
