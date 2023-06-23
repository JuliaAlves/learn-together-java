package com.example.inheritance.exercise;

public class MyIntegerArray {
  private int[] array;
  private OperatorType operator?;

  public MyIntegerArray(OperatorType operator?, int[] ints) {
    array = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      array[i] = ints[i];
    }
  }

  public int[] sorted() {
    return operator?.sort(this.array);
  }

  public int[] reverse() {
    return operator?.reverse(this.array);
  }
}
