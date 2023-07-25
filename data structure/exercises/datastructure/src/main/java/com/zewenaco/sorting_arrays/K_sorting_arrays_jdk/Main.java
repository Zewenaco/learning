package com.zewenaco.sorting_arrays.K_sorting_arrays_jdk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Arrays.parallelSort(intArray);

        printIntArray(intArray);
    }

    private static void printIntArray(int[] intArray) {
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
