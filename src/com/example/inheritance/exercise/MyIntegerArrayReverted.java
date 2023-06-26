package com.example.inheritance.exercise;

import java.util.Arrays;

public class MyIntegerArrayReverted extends MyIntegerArray{
    public MyIntegerArrayReverted(int[] ints) {
        super(ints);
    }

    @Override
    public void sorted() {
        int[] localArray = array;
        for (int i = 0; i < localArray.length; i++) {
            int maxIndex = i;
            for (int j = i; j < localArray.length; j++) {
                if (localArray[j] > localArray[maxIndex]) {
                    maxIndex = j;
                }
            }
            int maxVal = localArray[maxIndex];
            localArray[maxIndex] = localArray[i];
            localArray[i] = maxVal;
        }
        array = localArray;
    }

    public static void main(String[] args) {
        MyIntegerArrayAscending array1 = new MyIntegerArrayAscending(new int[]{5, 2, 4, 1, 3});
        array1.sorted();
        System.out.println(array1);

        MyIntegerArrayReverted array2 = new MyIntegerArrayReverted(new int[]{5, 2, 4, 1, 3});
        array2.sorted();
        System.out.println(array2);
    }
}
