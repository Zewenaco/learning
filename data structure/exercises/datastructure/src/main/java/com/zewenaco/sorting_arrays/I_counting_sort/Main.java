package com.zewenaco.sorting_arrays.I_counting_sort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 1, 10);
        printIntArray(intArray);
    }

    public static void countingSort(int[] input, int min, int max) {
        // CountArray it would be the same size of the array to be sorted
        int[] countArray = new int[(max-min) + 1];

        for (int i = 0; i < countArray.length; i++) {
            // Increment the right position which is the value of the inputArray at position i  minus 1, to modify the right position in array
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max ; i++) {
            // modify the inputArray value at index I and add the same number the necessary times, and each time will substract one number to make it 0 and break the while
            while(countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
    private static void printIntArray(int[] intArray) {
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
