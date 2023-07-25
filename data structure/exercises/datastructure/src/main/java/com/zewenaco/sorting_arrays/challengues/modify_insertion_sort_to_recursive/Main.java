package com.zewenaco.sorting_arrays.challengues.modify_insertion_sort_to_recursive;

public class Main {

    public static void main (String[] java) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionRecursiveSort(intArray, 1);
        printIntArray(intArray);
    }

    private static void insertionRecursiveSort(int[] intArray, int index) {
        if (index >= intArray.length) {
            return;
        }
        int newElement = intArray[index];
        intArray[recursive(intArray, index, newElement)] = newElement;
        insertionRecursiveSort(intArray, ++index);
    }

    private static int recursive(int[] intArray, int index, int newElement) {
        if (index <= 0 || intArray[index - 1] < newElement) {
            return index;
        }
        if (intArray[index - 1] > newElement) {
            intArray[index] = intArray[index - 1];
        }
        return recursive(intArray, --index, newElement);
    }


    private static void printIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
