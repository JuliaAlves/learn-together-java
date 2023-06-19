package com.example.inheritance;

public class NonVertebrate extends Animal {

  public NonVertebrate(String species) {
    super(species, "não-vertebrado");
  }

  public String animalSound() {
    return "";
  }
}
