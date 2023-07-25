package com.zewenaco.sorting_arrays.J_radix_sort;

public class Main {

    public static void main(String[] args) {
        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixArray, 10, 4);

        printIntArray(radixArray);
    }

    private static void radixSort(int[] radixArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(radixArray, i, radix);
        }

    }

    private static void radixSingleSort(int[] radixArray, int i, int radix) {
        int numItems = radixArray.length;
        int[] countArray = new int[radix];
        // count each position in the countArray
        for (int value: radixArray) {
            countArray[getDigit(i, value, radix)]++;
        }

        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[ j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(i, radixArray[tempIndex], radix)]] = radixArray[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            radixArray[tempIndex] = temp[tempIndex];
        }

    }

    private static int getDigit(int i, int value, int radix) {
        return value / (int) Math.pow(radix, i) % radix;
    }


    private static void printIntArray(int[] intArray) {
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
