package com.example.generics;

import java.util.Arrays;

public class MyIntegerArrayAscending {
    public static <A extends Comparable<A>> A[] sorted(A[] list) {
        A[] localArray = list;
        for (int i = 0; i < localArray.length; i++) {
            int minIndex = i;
            for (int j = i; j < localArray.length; j++) {
                if (localArray[j].compareTo(localArray[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            A minVal = localArray[minIndex];
            localArray[minIndex] = localArray[i];
            localArray[i] = minVal;
        }
        return localArray;
    }

    public static void main(String[] args) {
        Integer[] list = new Integer[]{5, 2, 4, 1, 3};
        System.out.println(Arrays.toString(sorted(list)));

        String[] list2 = new String[]{"c", "a", "b"};
        System.out.println(Arrays.toString(sorted(list2)));
    }
}
