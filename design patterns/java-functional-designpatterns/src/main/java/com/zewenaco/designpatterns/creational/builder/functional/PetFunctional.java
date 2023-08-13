package com.zewenaco.designpatterns.creational.builder.functional;

import java.util.Optional;
import java.util.function.Consumer;

public class PetFunctional {
  private final String name;
  private final String ownerName;
  private final Integer age;
  private final Sex sex;
  private final PetType petType;

  public PetFunctional(Builder builder) {
    this.name = builder.name;
    this.ownerName = builder.ownerName;
    this.age = builder.age;
    this.sex = builder.sex;
    this.petType = builder.petType;
  }

  static class Builder {
    protected String name;
    protected String ownerName;
    protected Integer age;
    private final Sex sex;
    private final PetType petType;

    public Builder(PetType petType, Sex sex) {
      this.petType = petType;
      this.sex = sex;
    }

    public Builder with(Consumer<Builder> consumer) {
      consumer.accept(this);
      return this;
    }

    public PetFunctional build() {
      return new PetFunctional(this);
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
