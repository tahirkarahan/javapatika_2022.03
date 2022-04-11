package com.patika.java101.loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        /*Factorial Calculating
         * n!=1 * 2 * 3 * 4 * 5 * 6 * ... * n-1 * n;
         */
        int n;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        // while-loop
        int i = 1;
        while (i < n) {
            i++;
            factorial *= i;
        }
        System.out.printf("%d!= %d ", n, factorial);

        //for-loop
        for (int m = 1; m <= n; m++) {
            factorial *= m;
        }
        System.out.printf("%d!= %d ", n, factorial);
    }
}
