package com.zewenaco.sorting_arrays.F_recursion;

public class Main {

    public static void main(String[] args) {
        int num = 3;
        System.out.printf("Which is the factorial of number %d?. %d%n", num, calcFactorial(num));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // n! = n * (n - 1)!

    public static int iterativeFactorial(int num) {
        int factorial = 1;
        if(num != 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static int calcFactorial(int num) {
        return recursiveFactorial(num);
    }

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num -1);
    }
}
