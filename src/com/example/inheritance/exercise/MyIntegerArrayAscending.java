package com.example.inheritance.exercise;

public class MyIntegerArrayAscending extends MyIntegerArray{
    public MyIntegerArrayAscending(int[] ints) {
        super(ints);
    }

    public int[] sorted() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int minVal = array[minIndex];
            array[minIndex] = array[i];
            array[i] = minVal;
        }
        return array;
    }
}