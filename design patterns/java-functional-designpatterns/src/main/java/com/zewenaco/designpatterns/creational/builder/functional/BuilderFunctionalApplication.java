package com.zewenaco.designpatterns.creational.builder.functional;

public class BuilderFunctionalApplication {

  public static void main(String[] args) {
    final PetFunctional petFunctionalFerret =
        new PetFunctional.Builder(PetFunctional.PetType.FERRET, PetFunctional.Sex.MALE)
            .with(
                builder -> {
                  builder.name = "Syna Ayun";
                  builder.ownerName = "Anderson Gonzalez";
                  builder.age = 2;
                })
            .build();

    System.out.printf(
        "PET %s called %s, his owner is %s, he is %d year(s) old and %s sex %n",
        petFunctionalFerret.getPetType().name(),
        petFunctionalFerret.getName().get(),
        petFunctionalFerret.getOwnerName().get(),
        petFunctionalFerret.getAge().get(),
        petFunctionalFerret.getSex().toString());
  }
}
