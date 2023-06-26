package com.example.inheritance.exercise;

import java.util.Arrays;

public abstract class MyIntegerArray {
  protected int[] array;

  public MyIntegerArray(int[] ints) {
    array = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      array[i] = ints[i];
    }
  }

  public abstract void sorted();

  @Override
  public String toString() {
    return Arrays.toString(array);
  }
}
