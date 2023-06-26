package com.example.inheritance.exercise;

public abstract class MyIntegerArray {
  protected int[] array;

  public MyIntegerArray(int[] ints) {
    array = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      array[i] = ints[i];
    }
  }

  public abstract int[] sorted();
}
