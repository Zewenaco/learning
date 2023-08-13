package com.zewenaco.designpatterns.creational.builder.common;

public class BuilderCommonApplication {

  public static void main(String[] args) {
    final Pet petFerret =
        Pet.builderOf(Pet.PetType.FERRET, Pet.Sex.MALE)
            .withAge(2)
            .withName("Syna Ayun")
            .withOwnerName("Anderson")
            .build();
    final Pet petDog = Pet.builderOf(Pet.PetType.DOG, Pet.Sex.FEMALE).build();

    System.out.printf(
        "PET %s called %s%n", petFerret.getPetType().name(), petFerret.getName().get());
    System.out.printf(
        "PET %s %s%n",
        petDog.getPetType().name(), petDog.getName().orElse("(this pet doesn't have name)"));
  }
}
