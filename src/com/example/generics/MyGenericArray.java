package com.example.generics;

import java.util.Arrays;

public class MyGenericArray <G extends Comparable<G>> {
    private G[] array;

    public MyGenericArray(G[] list) {
        array = list;
    }

    public G[] sorted() {
        G[] localArray = array;
        for (int i = 0; i < localArray.length; i++) {
            int minIndex = i;
            for (int j = i; j < localArray.length; j++) {
                if (localArray[j].compareTo(localArray[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            G minVal = localArray[minIndex];
            localArray[minIndex] = localArray[i];
            localArray[i] = minVal;
        }
        return localArray;
    }

    public static void main(String[] args) {
        Integer[] intList = new Integer[]{5, 2, 4, 1, 3};
        MyGenericArray<Integer> list1 = new MyGenericArray<Integer>(intList);
        System.out.println(Arrays.toString(list1.sorted()));

        String[] strList = new String[]{"c", "a", "b", "d", "z"};
        MyGenericArray<String> list2 = new MyGenericArray<String>(strList);
        System.out.println(Arrays.toString(list2.sorted()));
    }
}
