package com.example.inheritance;

public class Cat extends Vertebrate {
  private String subespecies;

  public Cat(String subespecies) {
    super("Felis catus", "miau");
    this.subespecies = subespecies;
  }

  public String getSubespecies() {
    return subespecies;
  }
}
