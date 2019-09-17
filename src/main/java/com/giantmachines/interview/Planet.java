package com.giantmachines.interview;

public enum Planet {

  MERCURY("Mercury"), VENUS("Venus"), EARTH("Earth"), MARS("Mars"), JUPITER("Jupiter"), SATURN("Saturn"),
  URANUS("Uranus"), NEPTUNE("Neptune");

  public String name;

  Planet(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
