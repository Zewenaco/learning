package com.zewenaco.designpatterns.creational.builder.common;

import java.util.Optional;

public class Pet {
  private final String name;
  private final String ownerName;
  private final Integer age;
  private final Sex sex;
  private final PetType petType;

  private Pet(Builder builder) {
    this.name = builder.name;
    this.ownerName = builder.ownerName;
    this.age = builder.age;
    this.sex = builder.sex;
    this.petType = builder.petType;
  }

  public static Builder builderOf(PetType petType, Sex sex) {
    return new Builder(petType, sex);
  }

  static class Builder {
    private String name;
    private String ownerName;
    private Integer age;
    private Sex sex;
    private final PetType petType;

    private Builder(PetType petType, Sex sex) {
      this.petType = petType;
      this.sex = sex;
    }

    public Builder withAge(Integer age) {
      this.age = age;
      return this;
    }

    public Builder withSex(Sex sex) {
      this.sex = sex;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withOwnerName(String ownerName) {
      this.ownerName = ownerName;
      return this;
    }

    public Pet build() {
      return new Pet(this);
    }
  }

  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  public Optional<String> getOwnerName() {
    return Optional.ofNullable(ownerName);
  }

  public Optional<Integer> getAge() {
    return Optional.ofNullable(age);
  }

  public Sex getSex() {
    return sex;
  }

  public PetType getPetType() {
    return petType;
  }

  static enum Sex {
    FEMALE,
    MALE
  }

  static enum PetType {
    DOG,
    CAT,
    FERRET,
    TURTLE,
    FISH
  }
}
