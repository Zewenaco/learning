package com.zewenaco.sorting_arrays.E_shell_sort;

public class Main {

    public static void main (String[] java) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

       for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

           for ( int i = gap; i < intArray.length; i++) {
               int newElement = intArray[i];
               int j = i;
               while (j >= gap && intArray[j - gap] > newElement) {
                   intArray[j] = intArray[j - gap];
                   j -= gap;
               }
               intArray[j] = newElement;
           }

       }

        printIntArray(intArray);
    }

    private static void printIntArray(int[] intArray) {
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
