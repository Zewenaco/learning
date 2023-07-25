package com.zewenaco.sorting_arrays.C_selection_sort;

public class Main {

    public static void main (String[] java) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            var higherIndex = findHigherValueIndex(array, lastUnsortedIndex);
            swap(array, higherIndex, lastUnsortedIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int findHigherValueIndex(int[] array, int lastUnsortedIndex) {
        var higherIndex = 0;
        for (int i = 1; i < lastUnsortedIndex; i++) {
            if (array[higherIndex] < array[i]) {
                higherIndex = i;
            }
        }
        return higherIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
