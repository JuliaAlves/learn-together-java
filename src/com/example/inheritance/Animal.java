package com.example.inheritance;

public abstract class Animal {
  private String species;
  private String filo;

  public Animal(String species, String filo) {
    this.species = species;
    this.filo = filo;
  }

  public String getSpecies() {
    return species;
  }

  public boolean isAerobic() {
    return true;
  }

    public String getFilo() {
    return filo;
  }

  public abstract String animalSound();
}
