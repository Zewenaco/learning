package com.zewenaco.designpatterns.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    // Integer[] arrInt = {0, -1, 2, -3, 1};
    // Integer[] arrInt = {1, -2, 1, 0, 5};
    Integer[] arrInt = {7, 12, 3, 1, 2, -6, 5, -8, 6};
    System.out.println("Result = " + String.join(", ", findThreeSum_Sorting(arrInt, 0)));

  }

  public static Set<String> findThreeSum_Sorting(Integer[] arrInt, Integer target) {
    Integer[] newArrInt = Arrays.stream(arrInt)
            .sorted(Comparator.naturalOrder()).toArray(Integer[]::new);
    Set<String> stringSet = new TreeSet<>();
    IntStream.range(0, newArrInt.length)
            .forEach(i -> {
              if (i + 1 < newArrInt.length) {
                IntStream.range(i + 1, newArrInt.length)
                        .forEach(j -> {
                          if (j + 1 < newArrInt.length) {
                            IntStream.range(j + 1, newArrInt.length)
                                    .filter(k -> target.equals(newArrInt[i] + newArrInt[j] + newArrInt[k]))
                                    .findFirst().ifPresent(
                                    k -> stringSet.add("(" + newArrInt[i] + "," + newArrInt[j] + "," + newArrInt[k] + ")"));
                          }

                        });
              }
            });
    return stringSet;
  }
}
