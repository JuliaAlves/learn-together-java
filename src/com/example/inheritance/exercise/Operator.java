package com.example.inheritance.exercise;

public class Operator {
    public static int[] sorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // System.out.println("8: i: " + i);
            // System.out.println("9: minIndex: " + minIndex);
            for (int j = i; j < array.length; j++) {
                // System.out.println("10: j: " + j);
                // System.out.println("12: array[j] < array[minIndex]" + array[j] + " < " + array[minIndex]);
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


    // public static int[] reverse(int[] array) {

    // }

        public static void main(String[] args) {
        int[] array = {3, 4, 2, 5, 1};
        int[] sorted = sorted(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}