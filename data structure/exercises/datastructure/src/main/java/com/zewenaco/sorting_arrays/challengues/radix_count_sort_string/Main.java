package com.zewenaco.sorting_arrays.challengues.radix_count_sort_string;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String[] radixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        int radixForAbc = 25;
        printIntArray(radixSort(radixArray, radixForAbc, 5));

    }

    private static String[] radixSort(String[] radixArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixArray = radixSingleSort(radixArray, i, radix);
        }
        return radixArray;
    }

    private static String[] radixSingleSort(String[] radixArray, int i, int radix) {
        int numItems = radixArray.length;
        int[] countArray = new int[radix];
        // count each position in the countArray
        for (String value : radixArray) {
            countArray[getDigitFromString(i, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[
                    --countArray[
                            getDigitFromString(i, radixArray[tempIndex], radix)
                            ]
                    ] = radixArray[tempIndex];
        }
        return Arrays.copyOf(temp, temp.length);

    }

    private static int getDigitFromString(int i, String value, int radix) {
        var lowerCaseAbcStartAt97 = 97;
        var result = ((int) value.charAt(value.length() - (i + 1)) - lowerCaseAbcStartAt97);
        if (result > radix) {
            throw new IllegalArgumentException("String have a char different than lowerCase");
        }
        return result;
    }

    private static int getDigit(int i, int value, int radix) {
        return value / (int) Math.pow(radix, i) % radix;
    }


    private static void printIntArray(String[] intArray) {
        for (String str : intArray) {
            System.out.println(str);
        }
    }
}
