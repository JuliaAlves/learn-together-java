package com.example.inheritance.exercise;

public class MyIntegerArrayAscending extends MyIntegerArray{
    public MyIntegerArrayAscending(int[] ints) {
        super(ints);
    }

    @Override
    public void sorted() {
        int[] localArray = array;
        for (int i = 0; i < localArray.length; i++) {
            int minIndex = i;
            for (int j = i; j < localArray.length; j++) {
                if (localArray[j] < localArray[minIndex]) {
                    minIndex = j;
                }
            }
            int minVal = localArray[minIndex];
            localArray[minIndex] = localArray[i];
            localArray[i] = minVal;
        }
        this.array = localArray;
    }
}
