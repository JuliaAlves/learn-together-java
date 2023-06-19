package com.example.inheritance;

public class Vertebrate extends Animal {
  private String sound;

  public Vertebrate(String species, String sound) {
    super(species, "vertebrado");
    this.sound = sound;
  }

  public String animalSound() {
    return sound;
  }
}
