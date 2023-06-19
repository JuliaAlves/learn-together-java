package com.example.inheritance;

public class Classifier {

  public static void printSound(Animal animal) {
    System.out.println(animal.animalSound());
  }


  public static void main(String[] args) {
    Animal animal = new Cat("domestika");
    System.out.println(animal);
    System.out.println(animal.getSpecies());
    printSound(animal);
  }
}
